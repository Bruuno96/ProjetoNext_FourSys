package br.com.next.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@SequenceGenerator(allocationSize = 1, sequenceName = "sq_cartao", name = "cartao")
@Table(name = "TB_CARTAO")
public class Cartao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "cartao")
	private Integer id;
	
	@OneToOne
	private Conta conta;
	
	@Column(name="vl_numero")
	private String numero;
	
	@Column(name="nm_bandeira")
	private String bandeira;
	
	@Column(name = "pw_senha")
	private String senha;
	
	@Column(name = "bool_isAtivo")
	private boolean isAtivo;
	
	@Column(name="vl_limite")
	private double limite;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isAtivo() {
		return isAtivo;
	}
	public void setAtivo(boolean isAtivo) {
		this.isAtivo = isAtivo;
	}
	public String getBandeira() {
		return bandeira;
	}
	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	
	
}
