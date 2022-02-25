package Introducao;

import java.util.Scanner;

/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
 Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. */

public class AtividadeCinco {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double nota1, nota2, nota3, soma, media;
		
		System.out.println("Nota um do alune: ");
		nota1= ler.nextDouble();
		System.out.println("Nota dois do alune: ");
		nota2= ler.nextDouble();
		System.out.println("Nota três do alune: ");
		nota3= ler.nextDouble();
		
		soma= (nota1*2) + (nota2*3) + (nota3*5);
		media = soma/10;
		
		System.out.println("\nA média do alune é de: "+media+"\n");

	}

}
