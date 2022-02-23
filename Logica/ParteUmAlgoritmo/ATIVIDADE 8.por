programa
{
	
	funcao inicio()
	{
		real carroNovo, custoFab, custoporcento, custoimposto
		escreva("SISTEMA OITO\n")
		escreva("\nQuanto o carro custa na fábrica: ")
		leia(custoFab)

		custoporcento = (custoFab * 0.28)
		custoimposto = (custoFab * 0.45)
		carroNovo= (custoFab+custoporcento+custoimposto)

		escreva("\nO valor do Carro Novo para o consumidor final é de: ", carroNovo, "\n")

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 403; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */