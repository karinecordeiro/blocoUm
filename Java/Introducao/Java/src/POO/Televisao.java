package POO;

/*Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe, 
 em seguida crie um objeto produto eletrônico, defina as instancias deste objeto e apresente as 
 informações deste objeto no console. */

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
			System.out.print("\nTevê ligada.\n");
		else
			System.out.print("\nTevê desligada.\n");
	}
	
	public void aumentarVol()
	{
		if(volume<=100 && volume>=60)
			System.out.print("\nO volume está muito auto\n");
		else if(volume<=59 && volume>=26)
			System.out.print("\nO volume está adequado\n");
		else if(volume<=0 && volume>=25)
			System.out.print("\nO volume está muito baixo\n");
	}
	
	public void trocaCanal()
	{
		if(canal==2)
			System.out.print("\nEste canal é Tv Cultura");
		else if(canal==4)
			System.out.print("\nEste canal é SBT");
		else if(canal==5)
			System.out.print("\nEste canal é Globo");
		else if(canal==7)
			System.out.print("\nEste canal é Record");
		else if(canal==9)
			System.out.print("\nEste canal é Rede Tv");
		else if(canal==11)
			System.out.print("\nEste canal é Gazeta");
		else if(canal==13)
			System.out.print("\nEste canal é Band");
		else
			System.out.print("\nEste canal não tem sinal nesta área.");
			
	}
}
