/*
 * Matheus Coelho
 * Marcelo
 * */
package pkgFuncionario;

import pkgEndereco.Endereco;
import pkgEmpresa.Empresa;

public class RepComercial extends Funcionario{
	public RepComercial(int nM, String n, Endereco e, Empresa emp, String tel) {
		super(nM, n, e, emp, tel);
	}

	public double getRemuneracao(double ajFixa, double tVendas, double perc){
		double reTotal = 0;
		reTotal = ajFixa + (tVendas * perc);
		return reTotal;
	}
}