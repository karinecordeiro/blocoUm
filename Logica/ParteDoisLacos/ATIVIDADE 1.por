/*João, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo 
(50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que você faça um sistema que
leia a variável P (peso de tomates) e verifique se há excesso. Se houver, gravar na variável E (Excesso) 
e na variável M o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.*/

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
			escreva("\nO peso do tomate é: ",pesoTomate," quilos; O valor da multa é de: 0,00\n")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1010; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */