package POO;

/*Crie uma classe patinete e apresente os atributos e m�todos referentes esta classe, 
 em seguida crie um objeto patinete, defina as instancias deste objeto e apresente 
 as informa��es deste objeto no console.*/

	public class Patinete {
	String cor;
	boolean rodando;

	public Patinete(String x, boolean y)
	{
		this.cor = x;
		this.rodando=y;
	}
	
	public void movimento()
	{
		if(rodando==true)
		{
			System.out.print("O patinete "+cor+" est� se movimentando!\n");
		}
		else
			System.out.print("O patinete "+cor+" n�o est� em movimento.");
	}
}
