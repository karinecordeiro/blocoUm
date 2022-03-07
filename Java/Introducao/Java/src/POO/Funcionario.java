package POO;

/*Crie uma classe funcion�rio e apresente os atributos e m�todos referentes esta classe, 
em seguida crie um objeto funcion�rio, defina as instancias deste objeto e 
apresente as informa��es deste objeto no console.*/

public class Funcionario {

	String nome, sobrenome;
	int salario;
	int codigoFunc, diasTrab, diasMais, diasMenos;
	
	
	
	public Funcionario(String n, String so, int s, int cF, int dT)
	{
		this.nome= n;
		this.sobrenome= so;
		this.salario= s;
		this.codigoFunc= cF;
		this.diasTrab= dT;
	}
	
	public void nomeFunc()
	{
		System.out.print("Funcion�rio n� "+codigoFunc+ ": "+nome+" "+sobrenome+"\n");
	}
	public void salarioMes()
	{
		if(salario==1212)
			System.out.print("\nVoc� est� ganhando um sal�rio m�nimo\n");
		else if(salario>1212)
			System.out.print("\nVoc� est� ganhando mais que um sal�rio m�mino.\n");
		else
			System.out.print("\nVoc� est� ganhando menos que um sal�rio m�mino.\n");
	}
	public void dias()
	{
		if(diasTrab<20)
		{
			this.diasMenos= 20-diasTrab;
			System.out.print("\nVoc� trabalhou " +diasMenos+ " dias a menos");
		}
		else if(diasTrab>20)
		{
			this.diasMais= diasTrab-20;
			System.out.print("\nVoc� trabalhou " +diasMais+ " dias a mais");
		}
		else
			System.out.print("\nVoc� trabalhou os " +diasTrab+ "dias neste m�s.");
				;
	}
}
