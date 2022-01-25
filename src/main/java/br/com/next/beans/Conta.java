package br.com.next.beans;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public class Conta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@OneToOne
	private Cliente cliente;
	
	@Column(name="nr_numero_conta")
	private String numeroConta;
	
	@Column(name = "vl_saldo")
	private double saldo;
	
	@Column(name = "pw_senha")
	private String senha;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dt_abertura")
	private Calendar dataAbertura;
	
	@Column(name = "vl_taxa")
	private double taxa = 0.45;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Pix> pix;
	
	
	
	public Conta() {
		super();
	}

	public Conta(Cliente cliente, String numeroConta, double saldo, String senha, Calendar dataAbertura, double taxa,
			List<Pix> pix) {
		super();
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.senha = senha;
		this.dataAbertura = dataAbertura;
		this.taxa = taxa;
		this.pix = pix;
	}
	public Calendar getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public double getTaxa() {
		return taxa;
	}

	public Integer getId() {
		return id;
	}
	
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public List<Pix> getPix() {
		return pix;
	}
	public void setPix(List<Pix> pix) {
		this.pix = pix;
	}
}


	