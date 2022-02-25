package Introducao;

import java.util.Scanner;

/*2. Faça um sistema que leia a idade de uma pessoa
 *  expressa em dias e mostre-a expressa em anos, meses e dias. */

public class AtividadeDois {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idAnos, idMeses, idDias, diasTotais;
		
		System.out.println("Qual a sua idade em dias: ");
		diasTotais = ler.nextInt();
		
		idAnos = diasTotais/365;
		idMeses = diasTotais%365/30;
		idDias = diasTotais%365%30;
		
		System.out.println("\nVocê tem: " +idAnos+ " anos, " +idMeses+ " meses e " +idDias+ " dias.\n");

	}

}
