/*
 * Matheus Coelho
 * Marcelo
 * */
package pkgFuncionario;

import pkgEndereco.Endereco;
import pkgEmpresa.Empresa;

public class GenDir extends CLT{
//Metodo Construtor
	public GenDir(int nM, String n, Endereco e, Empresa emp, String tel){
		super(nM, n, e, emp, tel);
	}
	
//Outros Metodos
	public double getRemuneracaoGenDir(double salario, double axTransp, double axAl, int nFilhos, int diasUteis, int diasFalta, double lucrosEmp, double perc){
		double reTotal = super.getRemuneracaoCLT(salario, axTransp, axAl, nFilhos, diasUteis, diasFalta);
		reTotal += lucrosEmp * perc;
		return reTotal;
	}
}