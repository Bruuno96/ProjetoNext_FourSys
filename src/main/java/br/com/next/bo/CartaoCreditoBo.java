package br.com.next.bo;

import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.next.beans.CartaoCredito;
import br.com.next.beans.Conta;
import br.com.next.beans.TipoCliente;

@Service
public class CartaoCreditoBo {

	public CartaoCredito cadastraCartaoCredito(Conta c, String numero, String bandeira, String senha, int vencimento) {
		CartaoCredito cc = new CartaoCredito();
		cc.setAtivo(true);
		cc.setConta(c);
		cc.setBandeira(bandeira);
		cc.setNumero(UUID.randomUUID().toString());
		cc.setSenha(senha);
		cc.setVencimento(vencimento);

		TipoCliente tipo = c.getCliente().getTipo();

		if (tipo == TipoCliente.COMUM) {
			cc.setLimite(500);
		} else if (tipo == TipoCliente.PREMIUM) {
			cc.setLimite(1500);
		} else if (tipo == TipoCliente.SUPER) {
			cc.setLimite(5000);
		}
		return cc;
	}
	
	public boolean transacaoCredito(double valor, CartaoCredito c, String senha) {
		if (valor > c.getLimite() || !c.isAtivo() || !c.getSenha().equals(senha)) {
			return false;
		}
		c.setLimite(c.getLimite()-valor);
		c.setValorFatura(c.getValorFatura()+valor);
		return true;
	}
	
	public boolean pagamentoFatura(CartaoCredito cc) {
		if (cc.getConta().getSaldo() < cc.getValorFatura()) {
			return false;
		}
		cc.getConta().setSaldo(cc.getConta().getSaldo() - cc.getValorFatura());
		cc.setLimite(cc.getLimite()+cc.getValorFatura());
		return true;
	}
	
	
	/*public boolean vencimentoFatura(CartaoCredito c) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd");
		int diaAtual = Integer.parseInt(sdf.format(new Date()));
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM");
		int mesAtual = Integer.parseInt(sdf1.format(new Date()));
		if (mesAtual == 12) {
			//mes de vencimento passa a ser 1
			mesAtual = 1;
		} else {
			mesAtual++;
		}
		if (c.getVencimento()<= diaAtual && ) {
			
		}
		return true;
	}*/
	

}
