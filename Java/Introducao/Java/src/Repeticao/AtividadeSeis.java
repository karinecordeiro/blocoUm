package Repeticao;

import java.util.Scanner;

/*Escrever um programa que receba v�rios n�meros inteiros no teclado. 
E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).*/

public class AtividadeSeis {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int n, soma=0, media=0, contador=0;

		
		do
		{
			System.out.print("Digite um n�mero: ");
			n = ler.nextInt();
			{
				if(n!=0 && n%3 ==0)
				{
				soma= soma+n;
				contador++;
				}
			}
		}
		while(n>0 || n<0);
			media= soma/contador;
			System.out.print("\nA m�dia dos n�meros multiplos de 3 �: "+media);

	}

}
