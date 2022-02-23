programa
{
	
	funcao inicio()
	{
		
		
		inteiro idAnos, idMeses, idDias, diasTotais, idDAnos, idDMeses
		escreva("SISTEMA UM\n")
		escreva("\nQual sua idade em anos: ")
		leia(idAnos)
		escreva("qual sua idade em meses: ")
		leia(idMeses)
		escreva("Qual sua idade em dias: ")
		leia(idDias)

		idDAnos = idAnos*365
		idDMeses = idMeses*30
		diasTotais =  idDAnos+idDMeses+idDias

		escreva("\nSeu total de vida é de ", diasTotais ," dias.\n")
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 423; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */