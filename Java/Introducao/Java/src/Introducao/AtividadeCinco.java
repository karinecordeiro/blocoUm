package Introducao;

import java.util.Scanner;

/*5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. 
 Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente. */

public class AtividadeCinco {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double nota1, nota2, nota3, soma, media;
		
		System.out.println("Nota um do alune: ");
		nota1= ler.nextDouble();
		System.out.println("Nota dois do alune: ");
		nota2= ler.nextDouble();
		System.out.println("Nota tr�s do alune: ");
		nota3= ler.nextDouble();
		
		soma= (nota1*2) + (nota2*3) + (nota3*5);
		media = soma/10;
		
		System.out.println("\nA m�dia do alune � de: "+media+"\n");

	}

}
