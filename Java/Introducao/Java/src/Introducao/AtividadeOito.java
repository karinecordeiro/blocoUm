package Introducao;

import java.util.Scanner;

/*O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do 
 * distribuidor e dos impostos (aplicados ao custo de f�brica). Supondo que a percentagem 
 * do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o 
 * custo de f�brica de um carro e escreva o custo ao consumidor. */

public class AtividadeOito {

	public static void main(String[] args) {
		double carroNovo, custoFab, custoporcento, custoimposto;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Quanto o carro custa na f�brica: ");
		custoFab= ler.nextDouble();
		
		custoporcento= custoFab * 0.28;
		custoimposto = custoFab * 0.45;
		carroNovo= custoFab+custoporcento+custoimposto;
		
		System.out.println("\nO valor do Carro Novo para o consumidor final � de: "+carroNovo+"\n");

	}

}
