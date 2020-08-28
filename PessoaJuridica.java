package empresa;

public class PessoaJuridica extends funcionario {
	
	
	private String cnpj;
	
	public PessoaJuridica(String nome, String endereco, double salario, String email, String setor, String cpf,
			String dataDeAdmissao, String cnpj) {
		
		super(nome, endereco, salario, email, setor, cpf, dataDeAdmissao);
		this.cnpj = cnpj;
		
	}
	
	public String getCnpj() {
		return cnpj;
	}

	
	
	
	
	

}
