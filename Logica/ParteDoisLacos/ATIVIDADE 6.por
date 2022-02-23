programa
{
	
	funcao inicio()
	{
		inteiro suaIdade
		escreva("SISTEMA SEIS\n")
		escreva("\nDigite sua idade: ")
		leia(suaIdade)
	
		  

		se (suaIdade>=18)
			{escreva("\nVocê está na categoria de nadadores Adultos.\n")}

			senao se (suaIdade>=5 e suaIdade<=7)
			{escreva("\nVocê está na categogia de nadadores Infantis A.\n")}

			senao se (suaIdade>=8 e suaIdade<=11)
			{escreva("\nVocê está na categogia de nadadores Infantis B.\n")}
			
			senao se (suaIdade>=12 e suaIdade<=13)
			{escreva("\nVocê está na categogia de nadadores Juvenis A.\n")}

			senao se (suaIdade>=14 e suaIdade<=17)
			{escreva("\nVocê está na categogia de nadadores Juvenis B.\n")}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 669; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */