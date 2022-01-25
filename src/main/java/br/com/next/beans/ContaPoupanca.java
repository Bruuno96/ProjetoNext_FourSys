package br.com.next.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@PrimaryKeyJoinColumn(name = "id_conta_poupanca")
@Entity
@Table(name = "TB_CONTA_POUPANCA")
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
