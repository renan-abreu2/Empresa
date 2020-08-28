package empresa;

import java.security.ProtectionDomain;
import java.util.Random;

public abstract class funcionario {
	private String nome;
	private String endereco;
	private double salario;
	private String email;
	protected String setor;
	protected String cpf;
	public String dataDeAdmissao;
	private String dataDeDemissao;
	protected String status;
	protected String ferias;
	
	
	
	public funcionario(String nome, String endereco, double salario, String email, String setor, 
			String cpf, String dataDeAdmissao) {
		
		this.nome = nome;
		this.endereco = endereco;
		this.salario = salario;
		this.email = email;
		this.setor = setor;
		this.cpf = cpf;
		this.dataDeAdmissao = dataDeAdmissao;
		this.status = "Ativo";
		
	
			
	}
	

	
	
	


	public String getFerias() {
		return ferias;
	}







	public void setFerias(String ferias) {
		this.ferias = ferias;
		ferias = null;
	}







	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSetor() {
		return setor;
	}


	public void setSetor(String setor) {
		this.setor = setor;
	}


	public String getDataDeDemissao() {
		return dataDeDemissao;
	}


	public void setDataDeDemissao(String dataDeDemissao) {
		this.dataDeDemissao = dataDeDemissao;
	}


	public String getCpf() {
		return cpf;
	}


	public String getDataDeAdmissao() {
		return dataDeAdmissao;
	}
	
	
	public double contracheque() {
		
		return this.getSalario();
	}
	
	
	public void cadastro() {
		System.out.println("-------------------------------------- " );
		System.out.println("Nome do Funcionario:  " + getNome());
		System.out.println("-------------------------------------- " );
		System.out.println("Setor do Funcionario: " + getSetor());
		System.out.println("-------------------------------------- " );
		System.out.println("Email do funcionario : " + getEmail());
		System.out.println("-------------------------------------- " );
		System.out.println(getDataDeAdmissao());
		System.out.println("-------------------------------------- " );
		System.out.println("Endereco do funcionario: " +getEndereco());
		System.out.println("-------------------------------------- " );
		System.out.println("Salario: " + contracheque());
		System.out.println("-------------------------------------- " );
		System.out.println("O funcionario se encontra: " + getStatus());
		System.out.println("-------------------------------------- " );
		
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
		
	}

	
	public void trabalhar() {
		
		if(ferias != null) {
			
		System.out.println("!!!!!Você NÃO pode trabalhar no periodo de ferias!!!!");
		}else {
			System.out.println("TRABALHANDOOOOOOOO !!!1");
		}
		
		
	}

	
	public void pedirDemissao() {
		if ( getStatus() != "Inativo") {
			setStatus("Intativo");
			System.out.println("Você esta demitido !!!");
		
		}
			
		
			
		
	}
public void queroAumento(int aumento) {
		
		
		if (aumento > getSalario()){
				int Random = (int)(Math.random()*10+1);
				if(Random%2==0) {
					setSalario(aumento);
					System.out.println("O AUMENTO SOLICITADO FOI CONCEDIDO PARABENS!! AGORA TERA QUE TRABALHAR EM DOBRO :)");
				}else {
					System.out.println("O AUMENTO SOLICITADO FOI !!NEGADO!! VAI TRABALHAR!!");
				}
				
				
		}else {
				System.out.println("SERIO QUE VOCE QUER QUE REDUZA SEU SALARIO????");}
			
	
		
	
		
		}
	}



	
	
	
	
	
	
	
	
	
	
	
	


