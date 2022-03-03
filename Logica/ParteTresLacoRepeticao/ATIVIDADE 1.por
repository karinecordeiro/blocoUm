 /*A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos.
A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos;
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.*/

programa
{
	
	funcao inicio()
	{	
		inteiro filhos, somaF=0, mediaF, hb=20
		real salario, mediaSal, somaS=0.0, maiorSal=0.0 , porcentagem, salarioC=0.0
		escreva("SISTEMA UM\n")

		para(inteiro h=0; h<20;h++)
			{
			escreva("\nQual seu salário: ")
			leia(salario)
			somaS=somaS+salario

			se(salario > maiorSal)
				{
				maiorSal = salario
				}
			se(salario<=100)
				{
				salarioC++
				}
				
				escreva("Quantos filhos você tem: ")
				leia(filhos)
				somaF=somaF+filhos
			}
			limpa()
			mediaSal=somaS/hb
			escreva("\nA média do salário da população é de R$ ",mediaSal)
			
			mediaF=somaF/hb
			escreva("\nA população tem uma média de: ", mediaF)
			
			escreva("\nA maior salário é R$ ",maiorSal)
			
			porcentagem =(salarioC/hb)*100
			escreva("\nO percentual de pessoas com salário de até R$100,00 é de ",porcentagem, "%\n")	
	}
				
}
				


		
	
			

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 370; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */