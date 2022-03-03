/*Receber valores de base e altura de um triângulo e verificar se são valores válidos (positivos maiores que zero). 
Em caso afirmativo, calcular a área do triângulo.*/

programa
{
	
	funcao inicio()
	{
		escreva("SISTEMA SETE\n")
		
		real x, y, area
		escreva("\nDigite o valor da base do triangulo: ")
		leia(x)
		escreva("\nDigite o valor da altura do triangulo: ")
		leia(y)

		se (x>=1 e y >=1)
			{
			limpa()
			area=(x*y)/2
			escreva("\nA área do triangulo é igual a: ",area,"\n")
			}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 367; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */