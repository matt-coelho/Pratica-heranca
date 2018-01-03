/*
 * Matheus Coelho
 * Marcelo
 * */
package pkgFuncionario;

import pkgEndereco.Endereco;
import pkgEmpresa.Empresa;

public class Funcionario {
	protected int nMatricula;
	protected String nome;
	protected Endereco end;
	protected Empresa emp;
	protected String telefone;
//Construtores----------------------------------------	
	public Funcionario(int nM, String n, Endereco e, Empresa em, String tel){
		this.nMatricula = nM;
		this.nome = n;
		this.end = e;
		this.emp = em;
		this.telefone = tel;
	}
//Getters n Setters-----------------------------------
	
	//
	public int getnMatricula() {
		return nMatricula;
	}
	//
	public Empresa getEmp() {
		return emp;
	}
	//
	public void setEmp(Empresa emp) {
		this.emp = emp;
	}
	//
	public void setnMatricula(int nMatricula) {
		this.nMatricula = nMatricula;
	}
	//
	public String getNome() {
		return nome;
	}
	//
	public void setNome(String nome) {
		this.nome = nome;
	}
	//
	public Endereco getEnd() {
		return end;
	}
	//
	public void setEnd(Endereco end) {
		this.end = end;
	}
	//
	public String getTelefone() {
		return telefone;
	}
	//
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}