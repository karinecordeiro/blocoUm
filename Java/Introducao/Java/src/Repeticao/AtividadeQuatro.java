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
		
		int pessoa, idade, c=0, mN=0, hA=0, oC=0, pN=0, pC=0;
		char sexo, humor;
		
		System.out.print("Digite seu n�mero de funcion�rio: ");
		pessoa = ler.nextInt();
			
			while(pessoa>=1 && pessoa<=150)
				{
					System.out.print("\nPessoa n� "+pessoa++);
					
					System.out.print("\nDigite sua idade: ");
					idade = ler.nextInt();
					System.out.print("Digite o n�mero referente ao sexo que voc� se identifica: (1)Feminino, (2)Masculino, (3)Outros: ");
					sexo= ler.next().charAt(0);
					System.out.print("Digite o n�mero de acordo com seu humor: 1(Calme) 2(Nervose) 3(Agressive): ");
					humor= ler.next().charAt(0);
			
					if(humor=='1') 
						c++; 		/*c=Calme*/
					
					if(sexo=='1' && humor=='2') 
						mN++; 					/*mN=Mulheres Nervosas*/
					
					if(sexo=='2' && humor=='3')
						hA++;					 /*hA=Homens Agressivos*/
					
					if(sexo=='3' && humor=='1')
						oC++; 					/*oC=Outros Calmes*/
					
					if(humor=='2' && idade>40)
						pN++; 					/*pN=Pessoa Nervose*/
					
					if(humor=='1' && idade<18)
						pC++; 					/*pC=Pessoa Calme*/
				}
			
			System.out.print("\nO n�mero de pessoas calmas � igual a: "+c);
			System.out.print("\nO n�mero de mulheres nervosas � igual a: "+mN);
			System.out.print("\nO n�mero de homens agressivos � igual a: "+hA);
			System.out.print("\nO n�mero de outros calmos � igual a: "+oC);
			System.out.print("\nO n�mero de pessoas nervosas com mais de 40 anos � igual a: "+pN);
			System.out.print("\nO n�mero de pessoas calmas com menos de 18 � igual a: "+pC);
	}
}
