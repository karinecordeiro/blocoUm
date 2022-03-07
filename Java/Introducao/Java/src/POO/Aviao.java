package POO;

/*Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, 
 * em seguida crie um objeto avi�o, defina as instancias deste objeto e apresente 
 * as informa��es deste objeto no console.*/

public class Aviao {
	
	String modelo;
	double velocidade;
	boolean cinto;

	public Aviao(int x)
	{
		this.modelo = "AV-001";
		this.velocidade= x;
		this.cinto=true;
	}
	
	public void decolar()
	{
		if(velocidade>=250 && velocidade<=300 && cinto==true)
		System.out.print("\nO avi�o est� decolando pois chegou a velocidade correta e os cintos foram colocados corretamente\n");
		
		else if(velocidade>=250 && velocidade<=300 && cinto==false)
		System.out.print("\nO avi�o chegou a velocidade correta, mas n�o pode decolar pois os cintos n�o foram colocados corretamente\n");
		
		else if(velocidade>=250 && velocidade<=300 && cinto==false)
			System.out.print("\nO avi�o ainda n�o pode pousar, pois n�o chegou a velocidade correta e os cintos n�o foram colocados corretamente\n");
		else 
			System.out.print("\nO avi�o n�o pode decolar pois ainda n�o chegou a velocidade correta, mas os cintos foram colocados corretamente\n");
	}
	
	public void pousar()
	{
		if(velocidade>=200 && velocidade<=240 && cinto==true)
		System.out.print("\nO avi�o est� pousando pois chegou a velocidade correta e os cintos foram colocados corretamente\n");
		
		else if(velocidade>=200 && velocidade<=240 && cinto==false)
			System.out.print("\nO avi�o chegou a velocidade correta, mas n�o pode pousa pois os cintos n�o foram colocados corretamente\n");
			
		else if(velocidade>=200 && velocidade<=240 && cinto==false)
			System.out.print("\nO avi�o ainda n�o pode pousar, pois n�o chegou a velocidade correta e os cintos n�o foram colocados corretamente\n");
		else 
			System.out.print("\nO avi�o n�o pode pousar pois ainda n�o chegou a velocidade correta, mas os cintos foram colocados corretamente\n");
	}

}
