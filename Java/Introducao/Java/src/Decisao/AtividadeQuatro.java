package Decisao;

import java.util.Scanner;

/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero 
 * � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba 
 * o n�mero elevado ao quadrado.*/

public class AtividadeQuatro {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int x, q;
		double r;
		
		System.out.print("Digite um n�mero: ");
		x = ler.nextInt();
		
		if(x%2 !=00)
			{
			q = x*x;
			System.out.print("\nO n�mero " +x+" � IMPAR e elevado ao quadrado �: "+q);
			}
		else
			{
			r= Math.sqrt(x);
			System.out.print("\nO n�mero " +x+ " � PAR e sua raiz quadrada �: "+ r);
			}
		
		
	}

}
