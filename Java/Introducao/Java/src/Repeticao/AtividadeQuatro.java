package Repeticao;

import java.util.Scanner;

/*Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas 
dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas era perguntado: idade 
sexo (1-feminino / 2-masculino / 3-Outros), e as op��es (1, se a pessoa era calma; 
2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre:
o n�mero de pessoas calmas; / n�mero de mulheres nervosas; /n�mero de homens agressivos; 
o n�mero de outros calmos; /n�mero de pessoas nervosas com mais de 40 anos; 
o n�mero de pessoas calmas com menos de 18 anos.*/

public class AtividadeQuatro {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);	
		
		int pessoa, idade, sexo, caracteristica, soma, sF, sM, sO, sC, sN, sA;
		
		System.out.print("Digite seu n�mero de funcion�rio: ");
		pessoa = ler.nextInt();
			
			while(pessoa>=1 && pessoa<=5)
				{
					System.out.print("\nPessoa n� "+pessoa++);
					System.out.print("\nDigite sua idade: ");
					idade = ler.nextInt();
					System.out.print("Digite o n�mero referente ao sexo que voc� se identifica: (1)Feminino, (2)Masculino, (3)Outros: ");
					sexo= ler.nextInt();
					System.out.print("Digite o n�mero de acordo como voc� se sente hoje: 1(Calme) 2(Nervose) 3(Agressive): ");
					caracteristica= ler.nextInt();
					
				 	
				 	
				}
			System.out.print("\nO n�mero de pessoas calmas � igual a: ");
			System.out.print("\nO n�mero de mulheres nervosas � igual a: ");
			System.out.print("\nO n�mero de homens agressivos � igual a: ");
			System.out.print("\nO n�mero de outros calmos � igual a: ");
			System.out.print("\nO n�mero de pessoas nervosas com mais de 40 anos � igual a: ");
			System.out.print("\nO n�mero de pessoas calmas com menos de 18 � igual a: ");
	}

}
