package Decisao;

import java.util.Scanner;

/*Faça um programa em que permita a entrada de um número qualquer e exiba se este número 
 * é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba 
 * o número elevado ao quadrado.*/

public class AtividadeQuatro {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int x, q;
		double r;
		
		System.out.print("Digite um número: ");
		x = ler.nextInt();
		
		if(x%2 !=00)
			{
			q = x*x;
			System.out.print("\nO número " +x+" é IMPAR e elevado ao quadrado é: "+q);
			}
		else
			{
			r= Math.sqrt(x);
			System.out.print("\nO número " +x+ " é PAR e sua raiz quadrada é: "+ r);
			}
		
		
	}

}
