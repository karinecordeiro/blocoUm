package Introducao;

import java.util.Scanner;

/*3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica 
 * expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

public class AtividadeTres {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int segundos, minutos, horas, segundosTotais;
		
		System.out.println("O tempo total de segundos em uma f�brica expressa foi de: ");
		segundosTotais = ler.nextInt();
		
		horas = segundosTotais/360;
		minutos = segundosTotais%360/360;
		segundos = segundosTotais%306%360;
		
		System.out.println("\nO evento durou um total de: " +horas+ " horas, " +minutos+" minutos e "
				+segundos+ " segundos.\n");
		
		
		

	}

}
