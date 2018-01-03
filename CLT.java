/*
 * Matheus Coelho
 * Marcelo
 * */
package pkgFuncionario;

import pkgEndereco.Endereco;
import pkgEmpresa.Empresa;

public class CLT extends Funcionario{
	
//Construtor-----------------------------------------
	public CLT(int nM, String n, Endereco e, Empresa emp, String tel) {
		super(nM, n, e, emp, tel);
	}
	
//Outros Metodos-------------------------------------
	public double getRemuneracaoCLT(double salario, double axTransp, double axAl, int nFilhos, int diasUteis, int diasFalta){
		double reFinal;
		
		if(diasFalta > 0){//quanto mais o funcionario faltar mais ele recebe?
			salario = (salario / diasUteis) * diasFalta;
		}
		
		reFinal = salario + axTransp + axAl;
		
		if(nFilhos > 0){
			reFinal += 50.0 * nFilhos;
		}
		
		return reFinal;
	}
}
