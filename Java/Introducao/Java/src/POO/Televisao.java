package POO;

/*Crie uma classe produto eletr�nico e apresente os atributos e m�todos referentes esta classe, 
 em seguida crie um objeto produto eletr�nico, defina as instancias deste objeto e apresente as 
 informa��es deste objeto no console. */

public class Televisao {
	
	boolean ligar;
	int volume;
	int canal;
	
	public Televisao(int x, int y)
	{
		this.ligar=true;
		this.volume=x;
		this.canal=y;
		
	}
	
	public void ligando()
	{
		if(ligar==true)
			System.out.print("\nTev� ligada.\n");
		else
			System.out.print("\nTev� desligada.\n");
	}
	
	public void aumentarVol()
	{
		if(volume<=100 && volume>=60)
			System.out.print("\nO volume est� muito auto\n");
		else if(volume<=59 && volume>=26)
			System.out.print("\nO volume est� adequado\n");
		else if(volume<=0 && volume>=25)
			System.out.print("\nO volume est� muito baixo\n");
	}
	
	public void trocaCanal()
	{
		if(canal==2)
			System.out.print("\nEste canal � Tv Cultura");
		else if(canal==4)
			System.out.print("\nEste canal � SBT");
		else if(canal==5)
			System.out.print("\nEste canal � Globo");
		else if(canal==7)
			System.out.print("\nEste canal � Record");
		else if(canal==9)
			System.out.print("\nEste canal � Rede Tv");
		else if(canal==11)
			System.out.print("\nEste canal � Gazeta");
		else if(canal==13)
			System.out.print("\nEste canal � Band");
		else
			System.out.print("\nEste canal n�o tem sinal nesta �rea.");
			
	}
}
