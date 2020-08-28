package empresa;

public class supervisor extends PessoaFisica {
	
	private double bonificacao = 0.8;

	public supervisor(String nome, String endereco, double salario, String email, String setor, String cpf,
			String dataDeAdmissao, String nit) {
		super(nome, endereco, salario, email, setor, cpf, dataDeAdmissao, nit);
		
	}

	public double getBonificacao() {
		return bonificacao* this.getSalario();
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}
	
	@Override
	public double contracheque() {
		return this.getSalario()*(1+this.bonificacao);
		
	}
	
	
	public void demitir(funcionario func ) {
		if (setor =="Gerencia"||setor=="Supervisao") {
			System.out.println("Voce nao pode demitir outro supervisor ou um gerente");
		}else {
			func.setStatus("Intativo");
			System.out.println("O funcionario " + func.getNome()+" foi demitido");
			
		}
	}

	

}
