package br.com.next.beans;

import java.util.Calendar;
import java.util.HashMap;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//apolice um documento de contratação do seguro. pode ter um ou mais seguros.
@Entity
@SequenceGenerator(allocationSize = 1, sequenceName = "sq_apolice", name = "apolice")
@Table(name = "TB_APOLICE")
public class Apolice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "name")
	private Integer id;

	@Temporal(TemporalType.DATE)
	@Column(name="data_assinatura")
	private Calendar dataAssinatura;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private HashMap<Integer,Seguro> seguros;
	
	@Column(name="vl_apolice")
	private double valorApolice;
	
	public Calendar getDataAssinatura() {
		return dataAssinatura;
	}
	public void setDataAssinatura(Calendar dataAssinatura) {
		this.dataAssinatura = dataAssinatura;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public HashMap<Integer, Seguro> getSeguros() {
		return seguros;
	}
	public void setSeguros(HashMap<Integer, Seguro> seguros) {
		this.seguros = seguros;
	}
	public double getValorApolice() {
		return valorApolice;
	}
	public void setValorApolice(double valorApolice) {
		this.valorApolice = valorApolice;
	}
	
	
	
}
