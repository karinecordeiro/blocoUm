/*Faça um sistema que leia um número inteiro e mostre uma mensagem indicando 
se este número é par ou ímpar, e se é positivo ou negativo.*/

programa
{
	
	funcao inicio()
	{
		escreva("SISTEMA 4.2\n")
		
		inteiro nx
		escreva("\nDigite um número: ")
		leia(nx)

		se(nx >0)
			{escreva("\nEsse número é POSITIV0 ")}
		senao
			{escreva("\nEsse número é NEGATIVO ")}
		
		se (nx%2 ==0)
			{escreva("e PAR.\n")}
		senao
			{escreva("e ÍMPAR.\n")}
		
		 
 

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 460; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */