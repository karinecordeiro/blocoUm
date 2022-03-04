package Repeticao;

import java.util.Scanner;

/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
 Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE) */

public class AtividadeTres {

	public static void main(String[] args) {
		
		int idade, contadorA=0, contadorV=0;
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite sua idade= ");
		idade =  ler.nextInt();
		
			while(idade!=-99)
			{
				if(idade<21)
				contadorA++;
			
			
			else if(idade>50)
				contadorV++;
				
				System.out.print("Digite sua idade= ");
				idade =  ler.nextInt();
				
			}
		
				System.out.print("\nO total de pessoas com menos de 21 anos é de:" +contadorA);
				System.out.print("\nO total de pessoas com mais de 50 anos é de:" +contadorV);
	}

}

