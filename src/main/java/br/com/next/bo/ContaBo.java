package br.com.next.bo;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.next.beans.Conta;
import br.com.next.beans.Pix;
import br.com.next.beans.TipoChavePix;
import br.com.next.repositories.ContaRepository;

@Service
public class ContaBo {
	public int contasCriadas = 0;

	@Autowired
	private ContaRepository contaRepository;
	
	public ContaBo() {}
	
	
	public Conta cadastrarConta(Conta conta, String senha) {
		conta.setNumeroConta(UUID.randomUUID().toString());
		System.out.println(conta.getSaldo());
		conta.setSaldo(0);
		conta.setSenha(senha);
		return contaRepository.save(conta);
	}

	public boolean cadastrarPix(Conta c, int tipoChave, String conteudoChave) {
		Pix p = new Pix();
		p.setActivated(true);
		if (tipoChave == 1) {
			p.setChave(TipoChavePix.CPF);
			p.setConteudoChave(c.getCliente().getCpf());
		} else if (tipoChave == 2) {
			p.setChave(TipoChavePix.EMAIL);
			p.setConteudoChave(conteudoChave);
			return true;
		} else if (tipoChave == 3) {
			p.setChave(TipoChavePix.TELEFONE);
			p.setConteudoChave(conteudoChave);
			return true;
		} else if (tipoChave == 4) {
			p.setChave(TipoChavePix.ALEATORIO);
			p.setConteudoChave(conteudoChave);
			return true;
		}
		return false;
	}

	public String novaConta() {
		return String.valueOf(contasCriadas++);
	}

	public boolean saque(Conta c, double valor) {
		if (c.getSaldo() >= valor) {
			c.setSaldo(c.getSaldo() - valor);
			return true;
		}
		return false;
	}

	public void deposito(Conta c, double valor) {
		c.setSaldo(c.getSaldo() + valor);

	}

	public String consultarSaldo(Conta c) {
		return "Saldo da conta:" + c.getSaldo();
	}

	/*public boolean transferencia(double valor, Conta c, String numeroConta) {
		if (contaDestino.getNumeroConta().equals(numeroConta)) {
			if (saque(c, valor)) {

				contaDestino.setSaldo(contaDestino.getSaldo() + valor);
				return true;
			}
			return false;
		}
		return false;
	}

	*/

	public void descontarTaxa(Conta c) {
		double taxaDebitada = (c.getSaldo() * (c.getTaxa() / 100));
		c.setSaldo(c.getSaldo() - taxaDebitada);
	}

}
