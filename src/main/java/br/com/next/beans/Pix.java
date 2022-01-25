package br.com.next.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(allocationSize = 1, sequenceName = "sq_pix", name = "pix")
@Table(name = "TB_PIX")
public class Pix {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "pix")
	private Integer id;

	@Enumerated(EnumType.ORDINAL)
	private TipoChavePix chave;
	
	@Column(name="ds_conteudo_chave")
	private String conteudoChave;
	
	@Column(name = "bool_isActivated")
	private boolean isActivated;
	
	
	
	public Pix() {
		super();
	}
	public Pix(TipoChavePix chave, String conteudoChave, boolean isActivated) {
		super();
		this.chave = chave;
		this.conteudoChave = conteudoChave;
		this.isActivated = isActivated;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public TipoChavePix getChave() {
		return chave;
	}
	public void setChave(TipoChavePix chave) {
		this.chave = chave;
	}
	
	public String getConteudoChave() {
		return conteudoChave;
	}
	public void setConteudoChave(String conteudoChave) {
		this.conteudoChave = conteudoChave;
	}
	public boolean isActivated() {
		return isActivated;
	}
	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated;
	}
	
	
}
