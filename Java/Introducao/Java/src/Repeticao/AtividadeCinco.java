package Repeticao;

import java.util.Scanner;

/*Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
No final, mostre a soma dos números digitados*/

public class AtividadeCinco {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int n, soma=0;
		
		do
		{
			System.out.print("Digite um número: ");
			n = ler.nextInt();
			soma = soma + n;
		}
		while(n<0 || n>0);
			
			System.out.print("\nA soma dos números digitados é de: "+soma);
			
	}

}
