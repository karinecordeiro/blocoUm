package Repeticao;

import java.util.Scanner;

/*Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
No final, mostre a soma dos n�meros digitados*/

public class AtividadeCinco {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int n, soma=0;
		
		do
		{
			System.out.print("Digite um n�mero: ");
			n = ler.nextInt();
			soma = soma + n;
		}
		while(n<0 || n>0);
			
			System.out.print("\nA soma dos n�meros digitados � de: "+soma);
			
	}

}
