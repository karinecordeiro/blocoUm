package Repeticao;

/* Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.*/

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
		System.out.println("\nA quantidade de n�meros pares s�o: "+contadorP);
		System.out.println("\nA quantidade de n�meros impares s�o: "+contadorI);
			
	}

}
