package br.com.etec.entretec.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;


/**
 * The persistent class for the aluno database table.
 * 
 */
@Entity

public class Aluno extends Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name="CEP")
	private String cep;
	
	@Column(name="NUMERO")
	private String numeroCasa;
	
	@Column(name="COMPLEMENTO")
	private String complemento;
	
	@Column(name="PAIS")
	private String pais;
	
	@Column(name="RUA")
	private String rua;
	
	@Column(name="ESTADO")
	private String estado;
	
	@Column(name="CIDADE")
	private String cidade;
	
	@Column(name="BAIRRO")
	private String bairro;
	
	
	private String rg;
	private String cpf;
	

	
	private boolean deficiente;
	
	private Integer dddCelular;
	private String numeroCelular;
	private Integer dddTelefone;
	private String numeroTelefone;
	private String senha;
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public boolean isDeficiente() {
		return deficiente;
	}
	public void setDeficiente(boolean deficiente) {
		this.deficiente = deficiente;
	}
	public Integer getDddCelular() {
		return dddCelular;
	}
	public void setDddCelular(Integer dddCelular) {
		this.dddCelular = dddCelular;
	}
	public String getNumeroCelular() {
		return numeroCelular;
	}
	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}
	public Integer getDddTelefone() {
		return dddTelefone;
	}
	public void setDddTelefone(Integer dddTelefone) {
		this.dddTelefone = dddTelefone;
	}
	public String getNumeroTelefone() {
		return numeroTelefone;
	}
	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getNumeroCasa() {
		return numeroCasa;
	}
	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	

}