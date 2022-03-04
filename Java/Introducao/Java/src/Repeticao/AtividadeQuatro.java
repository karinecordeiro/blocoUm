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
		
		int pessoa, idade, c=0, mN=0, hA=0, oC=0, pN=0, pC=0;
		char sexo, humor;
		
		System.out.print("Digite seu número de funcionário: ");
		pessoa = ler.nextInt();
			
			while(pessoa>=1 && pessoa<=150)
				{
					System.out.print("\nPessoa n° "+pessoa++);
					
					System.out.print("\nDigite sua idade: ");
					idade = ler.nextInt();
					System.out.print("Digite o número referente ao sexo que você se identifica: (1)Feminino, (2)Masculino, (3)Outros: ");
					sexo= ler.next().charAt(0);
					System.out.print("Digite o número de acordo com seu humor: 1(Calme) 2(Nervose) 3(Agressive): ");
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
			
			System.out.print("\nO número de pessoas calmas é igual a: "+c);
			System.out.print("\nO número de mulheres nervosas é igual a: "+mN);
			System.out.print("\nO número de homens agressivos é igual a: "+hA);
			System.out.print("\nO número de outros calmos é igual a: "+oC);
			System.out.print("\nO número de pessoas nervosas com mais de 40 anos é igual a: "+pN);
			System.out.print("\nO número de pessoas calmas com menos de 18 é igual a: "+pC);
	}
}
