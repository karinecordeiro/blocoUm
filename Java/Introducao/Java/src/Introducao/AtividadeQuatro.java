package Introducao;

import java.util.Scanner;

/*Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e 
 * calcule a seguinte expressão: D=R+S/2, onde R=(A+B)² S=(B+C)²*/

public class AtividadeQuatro {

	public static void main(String[] args) {
		double a,b,c,r,s,d,m;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite quanto vale o A: ");
		a =  ler.nextDouble();
		System.out.println("Digite quanto vale o B: ");
		b =  ler.nextDouble();
		System.out.println("Digite quanto vale o C: ");
		c =  ler.nextDouble();
		
		r = Math.pow(a+b, 2);
		s = Math.pow(b+c, 2);
		d = r+s;
		m = d/2;
		
		System.out.println("\nO valor de D é igual a: "+m+".\n");
		
		
	}

}
