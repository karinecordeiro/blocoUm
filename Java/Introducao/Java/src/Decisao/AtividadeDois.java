package Decisao;

import java.util.Scanner;

/* Faça um programa que entre com três números e coloque em ordem crescente.*/

public class AtividadeDois {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int x, y, z; 

		
		System.out.print("Digite um número: ");
		x = ler.nextInt();
		System.out.print("Digite um número: ");
		y = ler.nextInt();
		System.out.print("Digite um número: ");
		z = ler.nextInt();
		
		if(x<=y && x<=z && y<=z)
			System.out.print("\nA ordem crescente é [" +x+ "] [" +y+ "] [" +z+ "]");
		else if (x<=y && x<=z && z<=y)
			System.out.print("\nA ordem crescente é [" +x+ "] [" +z+ "] [" +y+ "]");
		
		else if (y<=x && y<=z && x<=z)
			System.out.print("\nA ordem crescente é [" +y+ "] [" +x+ "] [" +z+ "]");
		else if (y<=x && y<=z && z<=x)
			System.out.print("\nA ordem crescente é [" +y+ "] [" +z+ "] [" +x+ "]");
		
		else if (z<=x && z<=y && x<=y)
			System.out.print("\nA ordem crescente é [" +z+ "] [" +x+ "] [" +y+ "]");
		else if (z<=x && z<=y && y<=x)
			System.out.print("\nA ordem crescente é [" +z+ "] [" +y+ "] [" +x+ "]");
			
	}

}
