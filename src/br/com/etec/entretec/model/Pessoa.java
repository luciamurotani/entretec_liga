package br.com.etec.entretec.model;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Pessoa {
	
	protected Integer id;
	
	 @Id
	  @GeneratedValue
	  @Column(name = "id")
	  public Integer getId() {
	    return this.id;
	  }
	 
	 public void setId(Integer id) {
		    this.id = id;
		  }
	
	@Column(name="NOME" ,length = 60, nullable = true)
	private String nome;
	
	@Column(name="SEXO")
	private String sexo;
	
	@Column(name="EMAIL_CORPORATIVO")
	private String emailCorporativo;
	
	@Column(name="EMAIL_PESSOAL")
	private String emailPessoal;
	
	@Column(name="TELEFONE")
	private String telefone;
	
	@Column(name="CELULAR")
	private String celular;
	
	@Column(name="FOTO")
	private String foto;
	
	@Column(name="DTA_NASCIMENTO")
	private Date dataNascimento;
	
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmailCorporativo() {
		return emailCorporativo;
	}

	public void setEmailCorporativo(String emailCorporativo) {
		this.emailCorporativo = emailCorporativo;
	}

	public String getEmailPessoal() {
		return emailPessoal;
	}

	public void setEmailPessoal(String emailPessoal) {
		this.emailPessoal = emailPessoal;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	

		
}
