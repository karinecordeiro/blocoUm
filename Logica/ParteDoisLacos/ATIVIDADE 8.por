/*Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma for maior que 100,
caso contrário imprimi-la com o valor zero.*/

programa
{
	
	funcao inicio()
	{
		escreva("SISTEMA OITO\n")
		
		inteiro n
		escreva("\nDigite um número: ")
		leia(n)
		limpa()
		
		se (n>100)
			{
			escreva("O NÚMERO É: ", n, ", maior que 100.\n")
			}
		senao
			{
			escreva("ESSE NÚMERO É iGUAL A " ,n*0, "\n")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 274; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */