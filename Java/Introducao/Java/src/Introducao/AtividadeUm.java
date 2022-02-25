package Introducao;

import java.util.Scanner;

/* 1. Faça um sistema que leia a idade de uma pessoa expressa em anos,
 *  meses e dias e mostre-a expressa apenas em dias.*/

public class AtividadeUm {

	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		int idAnos, idMeses, idDias, diasTotais, idDAnos, idDMeses;
		
		System.out.println("Qual sua idade em anos: ");
		idAnos = ler.nextInt();
		System.out.println("Qual sua idade em meses: ");
		idMeses = ler.nextInt();
		System.out.println("Qual sua idade em dias: ");
		idDias = ler.nextInt();
		
		idDAnos = idAnos*365;
		idDMeses = idMeses*30;
		diasTotais = idDAnos+idDMeses+idDias;
		
		System.out.println("\nSeu total de vida é de " + diasTotais + " dias.\n");
		
		
		
	}
}
 