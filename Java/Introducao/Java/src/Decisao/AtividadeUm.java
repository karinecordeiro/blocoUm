package Decisao;

import java.util.Scanner;

/*Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/


public class AtividadeUm {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int x, y, z; 

		
		System.out.print("Digite um n�mero: ");
		x = ler.nextInt();
		System.out.print("Digite um n�mero: ");
		y = ler.nextInt();
		System.out.print("Digite um n�mero: ");
		z = ler.nextInt();
		
		if(x>y && x>z)
			System.out.print("\nO n�mero " +x+" � o maior");
		else if(y>x && y>z)
			System.out.print("\nO n�mero " +y+" � o maior");
		else if(z>x && z>y)
			System.out.print("\nO n�mero " +z+" � o maior");

	}

}
