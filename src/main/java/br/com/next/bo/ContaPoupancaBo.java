package br.com.next.bo;

import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.next.beans.Cliente;
import br.com.next.beans.ContaPoupanca;

@Service
public class ContaPoupancaBo {

	public ContaPoupanca cadastrarContaPoupanca(Cliente c, String senha) {
		ContaPoupanca cp = new ContaPoupanca();
		cp.setCliente(c);
		cp.setNumeroConta(UUID.randomUUID().toString());
		cp.setSaldo(0);
		cp.setSenha(senha);
		return cp;
	}

	public void aplicarRendimento(ContaPoupanca cp) {
		double taxaAplicada = (cp.getSaldo() * (cp.getTaxa() / 100));
		cp.setSaldo(cp.getSaldo() + taxaAplicada);
	}

}
