package Decisao;

import java.util.Scanner;

/*Faça um programa que receba três inteiros e diga qual deles é o maior.*/


public class AtividadeUm {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int x, y, z; 

		
		System.out.print("Digite um número: ");
		x = ler.nextInt();
		System.out.print("Digite um número: ");
		y = ler.nextInt();
		System.out.print("Digite um número: ");
		z = ler.nextInt();
		
		if(x>y && x>z)
			System.out.print("\nO número " +x+" é o maior");
		else if(y>x && y>z)
			System.out.print("\nO número " +y+" é o maior");
		else if(z>x && z>y)
			System.out.print("\nO número " +z+" é o maior");

	}

}
