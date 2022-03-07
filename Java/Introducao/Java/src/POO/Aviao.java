package POO;

/*Crie uma classe avião e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto avião, defina as instancias deste objeto e apresente 
 * as informações deste objeto no console.*/

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
		System.out.print("\nO avião está decolando pois chegou a velocidade correta e os cintos foram colocados corretamente\n");
		
		else if(velocidade>=250 && velocidade<=300 && cinto==false)
		System.out.print("\nO avião chegou a velocidade correta, mas não pode decolar pois os cintos não foram colocados corretamente\n");
		
		else if(velocidade>=250 && velocidade<=300 && cinto==false)
			System.out.print("\nO avião ainda não pode pousar, pois não chegou a velocidade correta e os cintos não foram colocados corretamente\n");
		else 
			System.out.print("\nO avião não pode decolar pois ainda não chegou a velocidade correta, mas os cintos foram colocados corretamente\n");
	}
	
	public void pousar()
	{
		if(velocidade>=200 && velocidade<=240 && cinto==true)
		System.out.print("\nO avião está pousando pois chegou a velocidade correta e os cintos foram colocados corretamente\n");
		
		else if(velocidade>=200 && velocidade<=240 && cinto==false)
			System.out.print("\nO avião chegou a velocidade correta, mas não pode pousa pois os cintos não foram colocados corretamente\n");
			
		else if(velocidade>=200 && velocidade<=240 && cinto==false)
			System.out.print("\nO avião ainda não pode pousar, pois não chegou a velocidade correta e os cintos não foram colocados corretamente\n");
		else 
			System.out.print("\nO avião não pode pousar pois ainda não chegou a velocidade correta, mas os cintos foram colocados corretamente\n");
	}

}
