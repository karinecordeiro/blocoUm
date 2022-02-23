programa
{
	
	funcao inicio()
	{
		escreva("SISTEMA QUATRO\n")

		
		inteiro matriz[3][3], linha, coluna, soma1=0, soma2=0, somaDiagonal
		para(linha=0;linha<3;linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{
				escreva("Digite um valor: ")
				leia(matriz[linha][coluna])
				soma1=matriz[linha][coluna]+soma1
				soma2=matriz[0][0]+matriz[1][1]+matriz[2][2]
			}
		}
		escreva("\nA soma total dos valores é de: ",soma1)
		escreva("\n")
		escreva("\nA soma dos valores da primeira diagonal é: ",soma2, "\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 518; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 9, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */