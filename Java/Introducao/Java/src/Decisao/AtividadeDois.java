package Decisao;

import java.util.Scanner;

/* Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.*/

public class AtividadeDois {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int x, y, z; 

		
		System.out.print("Digite um n�mero: ");
		x = ler.nextInt();
		System.out.print("Digite um n�mero: ");
		y = ler.nextInt();
		System.out.print("Digite um n�mero: ");
		z = ler.nextInt();
		
		if(x<=y && x<=z && y<=z)
			System.out.print("\nA ordem crescente � [" +x+ "] [" +y+ "] [" +z+ "]");
		else if (x<=y && x<=z && z<=y)
			System.out.print("\nA ordem crescente � [" +x+ "] [" +z+ "] [" +y+ "]");
		
		else if (y<=x && y<=z && x<=z)
			System.out.print("\nA ordem crescente � [" +y+ "] [" +x+ "] [" +z+ "]");
		else if (y<=x && y<=z && z<=x)
			System.out.print("\nA ordem crescente � [" +y+ "] [" +z+ "] [" +x+ "]");
		
		else if (z<=x && z<=y && x<=y)
			System.out.print("\nA ordem crescente � [" +z+ "] [" +x+ "] [" +y+ "]");
		else if (z<=x && z<=y && y<=x)
			System.out.print("\nA ordem crescente � [" +z+ "] [" +y+ "] [" +x+ "]");
			
	}

}
