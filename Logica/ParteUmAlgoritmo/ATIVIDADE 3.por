programa
{
	
	funcao inicio()
	{

	inteiro segundos, minutos, horas, segundosTotais
		escreva("SISTEMA TRÊS\n")
		escreva("\nO tempo total de segundos em um fábrica expressa foi de: ")
		leia(segundosTotais)
		
		horas = segundosTotais/3600
		minutos = (segundosTotais%3600)/60
		segundos = (segundosTotais%3600)%60
		
		escreva("\nO eventou durou um total de:  " ,horas, " horas, " ,minutos, " minutos e " ,segundos , " segundos.\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 437; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */