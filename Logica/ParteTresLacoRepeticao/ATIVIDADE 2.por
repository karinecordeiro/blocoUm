/**Desenvolver um sistema que efetue a soma de todos os números ímpares que são  
multiplos de três e que se encontram no conjunto dos números de 1 até 500.**/

programa
{
	
	funcao inicio()
	{	
		escreva("SISTEMA DOIS\n")
		
		inteiro soma=0, n2=0

		para (inteiro n=3 ; n<=500; n++)
			{
			se(n%2 !=0)
				{
				se(n%3 ==0)					
					{
					soma = soma + n
					n2= soma-n
					escreva("\nA soma de " ,n2 , " + " ,n, " = ",soma, "\n")
					}
				}
			}
	}
}		

		

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 436; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */