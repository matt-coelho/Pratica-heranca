/*
 * Matheus Coelho
 * Marcelo
 * */
package pkgEmpresa;

public class Empresa {
	String nomeEmp;
	String teleCont;
//Construtores----------------------------------------	
	public Empresa (String n, String tel){
		this.nomeEmp = n;
		this.teleCont = tel;
	}
//Getters n Setters-----------------------------------
	public String getNomeEmp() {
		return nomeEmp;
	}
	//
	public void setNomeEmp(String nomeEmp) {
		this.nomeEmp = nomeEmp;
	}
	//
	public String getTeleCont() {
		return teleCont;
	}
	//
	public void setTeleCont(String teleCont) {
		this.teleCont = teleCont;
	}
}