package Decisao;

import java.util.Scanner;

/*Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto*/

	public class AtividadeTres {

		public static void main(String[] args) {
		
			Scanner ler = new Scanner (System.in);
			int x;
			System.out.print("Digite sua idade: ");
			x = ler.nextInt();
			
			if(x>=10 && x<=14)
				System.out.print("\nVoc� est� na categoria [INTANTIL]");
			else if(x>=15 && x<=17)
				System.out.print("\nVoc� est� na categoria [JUVENIL]");
			else if(x>=18 && x<=25)
				System.out.print("\nVoc� est� na categoria [ADULTO]");
			

	}

}
