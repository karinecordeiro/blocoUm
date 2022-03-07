package POO;

/*Crie uma classe funcionário e apresente os atributos e métodos referentes esta classe, 
em seguida crie um objeto funcionário, defina as instancias deste objeto e 
apresente as informações deste objeto no console.*/

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
		System.out.print("Funcionário n° "+codigoFunc+ ": "+nome+" "+sobrenome+"\n");
	}
	public void salarioMes()
	{
		if(salario==1212)
			System.out.print("\nVocê está ganhando um salário mínimo\n");
		else if(salario>1212)
			System.out.print("\nVocê está ganhando mais que um salário mímino.\n");
		else
			System.out.print("\nVocê está ganhando menos que um salário mímino.\n");
	}
	public void dias()
	{
		if(diasTrab<20)
		{
			this.diasMenos= 20-diasTrab;
			System.out.print("\nVocê trabalhou " +diasMenos+ " dias a menos");
		}
		else if(diasTrab>20)
		{
			this.diasMais= diasTrab-20;
			System.out.print("\nVocê trabalhou " +diasMais+ " dias a mais");
		}
		else
			System.out.print("\nVocê trabalhou os " +diasTrab+ "dias neste mês.");
				;
	}
}
