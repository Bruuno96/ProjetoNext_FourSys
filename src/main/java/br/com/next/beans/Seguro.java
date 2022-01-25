package br.com.next.beans;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SequenceGenerator(allocationSize = 1, sequenceName = "sq_seguro", name = "seguro")
@Table(name = "TB_SEGURO")
public class Seguro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "seguro")
	private Integer id;
	
	@Column(name="vl_valor")
	private double valor;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_carencia")
	private Calendar carencia;
	
	@Column(name="nm_nome")
	private String nome;
	
	@Column(name="ds_regras")
	private String regras;
	
	@ManyToOne
	private Apolice apolice;
	

	public Seguro() {
		super();
	}
	
	public Seguro(double valor, Calendar carencia, String nome, String regras) {
		super();
		this.valor = valor;
		this.carencia = carencia;
		this.nome = nome;
		this.regras = regras;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Calendar getCarencia() {
		return carencia;
	}
	public void setCarencia(Calendar carencia) {
		this.carencia = carencia;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRegras() {
		return regras;
	}
	public void setRegras(String regras) {
		this.regras = regras;
	}
	public Apolice getApolice() {
		return apolice;
	}

	public void setApolice(Apolice apolice) {
		this.apolice = apolice;
	}
	@Override
	public String toString() {
		return "Nome: "+this.nome+"\nRegras: "+this.regras;
	}
	
	
	
	
	
	

}
