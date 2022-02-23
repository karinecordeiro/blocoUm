programa
{
	
	funcao inicio()
	{
		inteiro pesoTomate, excessoPeso, multa
		escreva("SISTEMA UM\n")
		escreva("\nDigite o peso do tomate: ")
		leia(pesoTomate)
		excessoPeso = pesoTomate-50
		multa= excessoPeso*4
	

		se (pesoTomate>50)
			{
			escreva("\nO excesso de peso foi de: " ,excessoPeso, " quilos, e o valor da multa é de: " ,multa, " reais.\n")
			}
	senao
	{
	escreva("\nO excesso de peso é de: 0kg; O valor da multa é de: R$0,00.\n")
	}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 448; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */