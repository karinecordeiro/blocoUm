package Introducao;

import java.util.Scanner;

/*Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e 
 * calcule a seguinte express�o: D=R+S/2, onde R=(A+B)� S=(B+C)�*/

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
		
		System.out.println("\nO valor de D � igual a: "+m+".\n");
		
		
	}

}
