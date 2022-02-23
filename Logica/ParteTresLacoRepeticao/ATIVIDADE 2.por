
/**Desenvolver um sistema que efetue a soma de todos os números ímpares que são  
multiplos de três e que se encontram no conjunto dos números de 1 até 500.**/

programa
{
	
	funcao inicio()
	{
		inteiro soma=0
		escreva("SISTEMA 2\n")

		para (inteiro n=1 ; n<=500 ; n++)
		{
			se(n%2 !=0)
			{
			se(n%3 ==0)
		{
			soma = soma + n
		
		}
		escreva("\nO resultado da soma de 1 a 500 é: " , soma , "\n")
	}
		}}}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 392; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */