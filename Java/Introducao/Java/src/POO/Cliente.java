package POO;

/*Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em seguida crie um 
objeto cliente, defina as instancias deste objeto e apresente as informações deste objeto no console.*/

public class Cliente {
	
	String primeiroNome;
	String segundoNome;
	String email;
	String endereco;
	int numeroEnd;
	String cpf;
	String telefone;
	
	public Cliente ()
	{
		this.primeiroNome = "Maria";
		this.segundoNome = "Santos";
		this.email = "mariasantos@email.com";
		this.endereco = "Av: Rua da maria";
		this.numeroEnd = 65;
		this.cpf = "123.456.789-10";
		this.telefone = "(00) 12345-6789";		
			
	}
	
	public void cadastro()
	{
		System.out.print("\nNOME: "+this.primeiroNome+ " "+this.segundoNome);
		System.out.print("\nE-MAIL: "+this.email);
		System.out.print("\nENDEREÇO: "+this.endereco+ ", " +this.numeroEnd);
		System.out.print("\nCPF: "+this.cpf);
		System.out.print("\nTELEFONE: "+this.telefone);
	}
}
