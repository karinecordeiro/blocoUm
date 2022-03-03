/* Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos*/

programa
{
	
	funcao inicio()
	{
		escreva("SISTEMA SEIS\n")
		
		inteiro suaIdade
		escreva("\nDigite sua idade: ")
		leia(suaIdade) 

		se (suaIdade>=18)
			{
			escreva("\nVocê está na categoria de nadadores Adultos.\n")
			}
		senao se (suaIdade>=5 e suaIdade<=7)
			{
			escreva("\nVocê está na categoria de nadadores Infantis A.\n")
			}

		senao se (suaIdade>=8 e suaIdade<=11)
			{
			escreva("\nVocê está na categoria de nadadores Infantis B.\n")
			}
			
		senao se (suaIdade>=12 e suaIdade<=13)
			{
			escreva("\nVocê está na categoria de nadadores Juvenis A.\n")
			}
		senao se (suaIdade>=14 e suaIdade<=17)
			{
			escreva("\nVocê está na categoria de nadadores Juvenis B.\n")
			}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 892; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */