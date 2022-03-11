package POO;

/*Crie uma classe patinete e apresente os atributos e métodos referentes esta classe, 
 em seguida crie um objeto patinete, defina as instancias deste objeto e apresente 
 as informações deste objeto no console.*/

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
			System.out.print("O patinete "+cor+" está se movimentando!\n");
		}
		else
			System.out.print("O patinete "+cor+" não está em movimento.");
	}
}
