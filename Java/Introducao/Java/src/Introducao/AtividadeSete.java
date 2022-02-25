package Introducao;

import java.util.Scanner;

/*Um sistema de equações lineares do tipo: ax+by=c  dx+ey=f, pode ser resolvido segundo
mostrado abaixo: x= (ce-bf/ae-bd) y= (af-cd/ae-bd) 
Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y. */

public class AtividadeSete {

	public static void main(String[] args) {
			double a, b, c, d, e, f, x, y;
			
			Scanner ler = new Scanner(System.in);
			System.out.println("Digite o valor de a= ");
			a =  ler.nextDouble();
			System.out.println("Digite o valor de b= ");
			b =  ler.nextDouble();
			System.out.println("Digite o valor de c= ");
			c =  ler.nextDouble();
			System.out.println("Digite o valor de d= ");
			d =  ler.nextDouble();
			System.out.println("Digite o valor de e= ");
			e =  ler.nextDouble();
			System.out.println("Digite o valor de f= ");
			f =  ler.nextDouble();
			
			x = ((c*e)-(b*f)) / ((a*e)-(b*d));
			y = ((a*f)-(c*d)) / ((a*e)-(b*d));
			
			System.out.println("\nO valor de X é de: "+x);
			System.out.println("\nO valor de Y é de: "+y);
	}
	

}
