programa
{
	
	funcao inicio()
	{
		real a, b, c, d, ee, f, x, y
		escreva("SISTEMA SETE\n")
		escreva("\nDigite o valor de a: ")
		leia(a)
		escreva("Digite o valor de b: ")
		leia(b)
		escreva("Digite o valor de c: ")
		leia(c)
		escreva("Digite o valor de d: ")
		leia(d)
		escreva("Digite o valor de e: ")
		leia(ee)
		escreva("Digite o valor de f: ")
		leia(f)

		x=((c*ee)-(b*f)) / ((a*ee)-(b*d))
		y=((a*f)-(c*d)) / ((a*ee)-(b*d))

		escreva("\nO valor de X é de: " ,x)
		escreva("\nO valor de Y é de: ", y, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 518; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */