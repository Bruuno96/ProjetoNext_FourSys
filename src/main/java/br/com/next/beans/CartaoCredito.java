package br.com.next.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@PrimaryKeyJoinColumn(name = "id_conta_poupanca")
@Entity
@Table(name="TB_CARTAO_CREDITO")
@SequenceGenerator(allocationSize = 1, name = "cartao_credito", sequenceName = "seq_cartao_credito")
public class CartaoCredito extends Cartao{
	
	@Column(name = "vl_fatura")
	private double valorFatura;
	
	@Column(name="nr_prazo_vencimento")
	private int vencimento;
	
	public double getValorFatura() {
		return valorFatura;
	}
	public void setValorFatura(double valorFatura) {
		this.valorFatura = valorFatura;
	}
	public int getVencimento() {
		return vencimento;
	}
	public void setVencimento(int vencimento) {
		this.vencimento = vencimento;
	}
	
	
	

}
