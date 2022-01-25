package br.com.next.bo;

import org.springframework.stereotype.Service;

import br.com.next.beans.Conta;
import br.com.next.beans.Pix;
import br.com.next.beans.TipoChavePix;

@Service
public class PixBo {
	
	
	ContaBo cbo = new ContaBo();
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
	/*public boolean realizarPix(Conta c, String pix, double valor) {
		if (c.getSaldo() > valor) {
			if (contaDestino.getPix().getConteudoChave().equals(pix)) {
				contaDestino.setSaldo(contaDestino.getSaldo() + valor);
				cbo.saque(c, valor);
				return true;
			}
			return false;
		}
		return false;
	}*/
	
}
