package Introducao;

import java.util.Scanner;

/*Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, 
P(x1, y1) e P(x2, y2), escreva a dist�ncia entre eles. A f�rmula que efetua tal c�lculo �:
d= raiz(x2-x1)� + (y2-y1)� */

public class AtividadeSeis {

	public static void main(String[] args) {
	double d, x1, y1, x2, y2, p1, p2;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("O valor de x2= ");
		x2 =  ler.nextDouble();
		System.out.println("O valor de x1= ");
		x1 =  ler.nextDouble();
		System.out.println("O valor de y2= ");
		y2 =  ler.nextDouble();
		System.out.println("O valor de y1= ");
		y1 =  ler.nextDouble();
		
		
		
		p1 = Math.pow(x2-x1, 2);
		p2 = Math.pow(y2-y1, 2);
		d = Math.sqrt(p1+p2);
		
		System.out.println("\nA dist�ncia � igual a: "+d+".\n");

	}

}
