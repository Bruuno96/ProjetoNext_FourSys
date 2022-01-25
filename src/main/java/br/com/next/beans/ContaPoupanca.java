package br.com.next.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@PrimaryKeyJoinColumn(name = "id_conta_poupanca")
@Entity
public class ContaPoupanca extends Conta {
	
	@Column(name="vl_taxa")
	private double taxa;

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

}
