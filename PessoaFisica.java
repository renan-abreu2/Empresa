package empresa;

public class PessoaFisica extends funcionario {
	
	private String nit;
	
	
	
	public PessoaFisica(String nome, String endereco, double salario, String email, String setor, String cpf,String dataDeAdmissao,
			String nit) {
		super(nome, endereco, salario, email, setor, cpf, dataDeAdmissao);
		
		this.nit = nit;
		
	}

	
	public String getNit() {
		return nit;
	}

	
	
	
	
	

}
