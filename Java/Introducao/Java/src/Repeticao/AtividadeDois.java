package Repeticao;

/* Ler 10 números e imprimir quantos são pares e quantos são ímpares.*/

public class AtividadeDois {

	public static void main(String[] args) {
		
		int x, contadorP=0, contadorI=0;
		
		for(x=1; x<=10; x++)
			{
			if(x%2 ==0)
			contadorP++;
			}
		
		for(x=1; x<=10; x++)
			{
			if(x%2 !=0)
			contadorI ++;
			}
		System.out.println("\nA quantidade de números pares são: "+contadorP);
		System.out.println("\nA quantidade de números impares são: "+contadorI);
			
	}

}
