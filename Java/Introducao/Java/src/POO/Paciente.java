package POO;

/*Crie uma classe paciente e apresente os atributos e m�todos referentes esta classe,
em seguida crie um objeto paciente, defina as instancias deste objeto e apresente
as informa��es deste objeto no console. */

public class Paciente {

	String nome, gravidade;
	int senha;
	
	public void Paciente(String n, String g, int s)
	{
		this.nome=n;
		this.senha=s;
		this.gravidade=g;
	}
	public void fila()
	{
		if(gravidade=="vermelho")
			System.out.println("Senha n� "+senha+"...paciente "+nome+" est� em estado critico.\n");
		else if(gravidade=="amarelo")	
			System.out.println("Senha n� "+senha+"...paciente "+nome+" est� em estado neutro.\n");
		else if (gravidade=="azul")
			System.out.println("Senha n� "+senha+"...paciente "+nome+" se encontre est�vel.\n");
		
	}
	
}
