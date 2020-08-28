package empresa;



//import java.util.*;

//import java.util.ArrayList;
//
//import java.util.List;


public class programa {
	
	
	

	public static void main(String[] args) {
		
		//String nome, String endereco, double salario, String email, String setor, String cpf,String dataDeAdmissao,String nit
		
		
		
		
		PessoaFisica pf1 = new PessoaFisica("Renan", "Rua 1234ab", 1500.66, "remabreu@123.com", "Operador", "123.456.789-00","10/10/1010", "8888.888-99");
		
		gerente gr1 = new gerente("Adolfo", "Rua abreu",25000, "adm@123.com", "Gerencia","156.666.888-00","30/10/9999","999.888-909");
		gerente gr2 = new gerente("Ana", "Rua abreu",25000, "adm@123.com", "Gerencia","156.666.888-00","30/10/9999","999.888-909");
		
		supervisor sp1 = new supervisor("Pedro", "Rua abreu",25000, "adm@123.com", "Gerencia","156.666.888-00","30/10/9999","999.888-909");
		
	
		
		
	
		
pf1.queroAumento(2000);
		
		

		
	
//	List<funcionario> funcionarios = new ArrayList<>();
//		
//		funcionarios.add(g1);
//		funcionarios.add(g2);
//		
//		
//		System.out.println(funcionarios);
//		
	
		
		
		
		
		

		
		
		
	}

}
