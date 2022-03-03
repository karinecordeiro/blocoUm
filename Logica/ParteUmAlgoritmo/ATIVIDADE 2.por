/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.*/
programa
{
	
	funcao inicio()
	{
		inteiro idDias, idAnos, idMeses, totalDias
		escreva("SISTEMA DOIS\n")
		escreva("\nQual sua idade em dias: ")
		leia(totalDias)
		
		idAnos = totalDias/365
		idMeses = (totalDias%365)/30
		idDias = (totalDias%365)%30
		
		escreva("\nVocê tem:  " ,idAnos, " anos, " ,idMeses , " meses e " ,idDias , " dias.\n")
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 468; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */