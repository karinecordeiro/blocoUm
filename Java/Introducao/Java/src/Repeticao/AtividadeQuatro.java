package Repeticao;

import java.util.Scanner;

/*Uma empresa desenvolveu uma pesquisa para saber as características psicológicas 
dos indivíduos de uma região. Para tanto, a cada uma das pessoas era perguntado: idade 
sexo (1-feminino / 2-masculino / 3-Outros), e as opções (1, se a pessoa era calma; 
2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre:
o número de pessoas calmas; / número de mulheres nervosas; /número de homens agressivos; 
o número de outros calmos; /número de pessoas nervosas com mais de 40 anos; 
o número de pessoas calmas com menos de 18 anos.*/

public class AtividadeQuatro {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);	
		
		int pessoa, idade, sexo, caracteristica, soma, sF, sM, sO, sC, sN, sA;
		
		System.out.print("Digite seu número de funcionário: ");
		pessoa = ler.nextInt();
			
			while(pessoa>=1 && pessoa<=5)
				{
					System.out.print("\nPessoa n° "+pessoa++);
					System.out.print("\nDigite sua idade: ");
					idade = ler.nextInt();
					System.out.print("Digite o número referente ao sexo que você se identifica: (1)Feminino, (2)Masculino, (3)Outros: ");
					sexo= ler.nextInt();
					System.out.print("Digite o número de acordo como você se sente hoje: 1(Calme) 2(Nervose) 3(Agressive): ");
					caracteristica= ler.nextInt();
					
				 	
				 	
				}
			System.out.print("\nO número de pessoas calmas é igual a: ");
			System.out.print("\nO número de mulheres nervosas é igual a: ");
			System.out.print("\nO número de homens agressivos é igual a: ");
			System.out.print("\nO número de outros calmos é igual a: ");
			System.out.print("\nO número de pessoas nervosas com mais de 40 anos é igual a: ");
			System.out.print("\nO número de pessoas calmas com menos de 18 é igual a: ");
	}

}
