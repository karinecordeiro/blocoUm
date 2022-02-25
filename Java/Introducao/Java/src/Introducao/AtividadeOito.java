package Introducao;

import java.util.Scanner;

/*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do 
 * distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem 
 * do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o 
 * custo de fábrica de um carro e escreva o custo ao consumidor. */

public class AtividadeOito {

	public static void main(String[] args) {
		double carroNovo, custoFab, custoporcento, custoimposto;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Quanto o carro custa na fábrica: ");
		custoFab= ler.nextDouble();
		
		custoporcento= custoFab * 0.28;
		custoimposto = custoFab * 0.45;
		carroNovo= custoFab+custoporcento+custoimposto;
		
		System.out.println("\nO valor do Carro Novo para o consumidor final é de: "+carroNovo+"\n");

	}

}
