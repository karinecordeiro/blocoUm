/* Faça um sistema que leia um número inteiro e mostre uma mensagem indicando 
 se este número é par ou ímpar,e se é positivo ou negativo.*/

programa
{
	
	funcao inicio()
	{
		escreva("SISTEMA QUATRO\n")
		
		inteiro nx
		escreva("\nDigite um número: ")
		leia(nx)

		se(nx <0)
			{
			escreva("\nEsse número é NEGATIVO ")
			}
		senao
			{
			escreva("\nEsse número é POSITIVO ")
			}
		
		se (nx%2 !=0)
			{
			escreva("e IMPAR.\n")
			}
		senao
			{
			escreva("e PAR.\n")
			}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 481; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */