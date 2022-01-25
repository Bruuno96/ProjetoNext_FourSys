package br.com.next.bo;

import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.next.beans.Cartao;
import br.com.next.beans.Conta;

@Service
public class CartaoBo {
	
	public Cartao cadastraCartao(Conta c, String bandeira, String senha, double limite) {
		Cartao card = new Cartao(); 
		card.setAtivo(true);
		card.setConta(c);
		card.setBandeira(bandeira);
		card.setSenha(senha);
		card.setLimite(limite);
		card.setNumero(UUID.randomUUID().toString());
		
		return card;
	}
	
	public boolean transacaoDebito(double valor, Cartao c, String senha) {
		if (valor > c.getConta().getSaldo() || valor > c.getLimite() || !c.isAtivo() || 
				!c.getSenha().equals(senha)) {
			return false;
		}
		c.getConta().setSaldo(c.getConta().getSaldo() - valor);
		return true;
	}
	
	public void desativarCartao(Cartao c) {
		c.setAtivo(false);
	}
	
	

}
