package br.com.etec.entretec.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import br.com.etec.entretec.business.AlunoRN;
import br.com.etec.entretec.model.Aluno;

@ManagedBean
public class AlunoBean implements Serializable {

	/**
	 * default serialVersionUID
	 */
	private static final long serialVersionUID = 2321858673037123090L;

	
	/*
	 * objetos auxiliares
	 */
	Aluno aluno = new Aluno();
	List<Aluno> alunos = new ArrayList<Aluno>();
	List<Aluno> alunosSelecionados = new ArrayList<Aluno>();
	//Endereco endereco = new Endereco();
	
	
		
	AlunoRN service = new AlunoRN();
		
	@PostConstruct
	public void init() {
		//alunos = service.listar();
		aluno = new Aluno();

	}
	
	public void gravar() {
		if(aluno.getId()== null){
			service.gravar(aluno);
		}
        else{
        	service.atualizar(aluno);
        }
		aluno = new  Aluno();
		alunos = service.listar();
	}

	public void excluir() {
		service.excluir(this.aluno);
		alunos = service.listar();
		aluno = new Aluno();
		alunos = service.listar();
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public List<Aluno> getAlunosSelecionados() {
		return alunosSelecionados;
	}

	public void setAlunosSelecionados(List<Aluno> alunosSelecionados) {
		this.alunosSelecionados = alunosSelecionados;
	}


	/*
	 * getters e setters
	 * 
	 * 
	 */
	
	

}
