package empresa;

public class gerente extends PessoaFisica{
	
		private double bonificacao = 0.12;
	  int novoSalario;
	
		


			public gerente(String nome, String endereco, double salario, String email, String setor, String cpf,
					String dataDeAdmissao, String nit) {
		super(nome, endereco, salario, email, setor, cpf, dataDeAdmissao, nit);
		
		
		
		}
			
		

	





	public double getBonificacao() {
				return bonificacao * this.getSalario();
			}





			public void setBonificacao(float bonificacao) {
				this.bonificacao = bonificacao;
			}





	@Override
	public double contracheque() {
	return this.getSalario()*(1+this.bonificacao);
}

	public void demitir(funcionario func ) {
		if (setor =="Gerencia") {
			System.out.println("Voce nao pode demitir outro gerente");
		}else {
			func.setStatus("Intativo");
			System.out.println("O funcionario " + func.getNome()+" foi demitido");
			
		}
	}


	
	
	
	
	public void reajusteSalario(funcionario func, double novoSalario ) {
		
		if(func.getSetor()!="Gerencia"){
			if (novoSalario > func.getSalario()){
				func.setSalario(novoSalario);
			}else {
				System.out.println("O valor do novo salario não pode ser menor que o atual");}
			
	
		
	
		}else {
			System.out.println("Voce não pode reajustar seu Salario ou de um outro Gerente");
		}
	}










	
	





		
	
	










		
	}
