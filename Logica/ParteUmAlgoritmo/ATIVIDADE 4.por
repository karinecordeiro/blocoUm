/*Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e 
 * calcule a seguinte expressão: D=R+S/2, onde R=(A+B)² S=(B+C)²*/
programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro a, b, c, r, s, d
		escreva("SISTEMA QUATRO\n")
		escreva("\nDigite quanto vale o A: ")
		leia(a)
		escreva("Digite quanto vale o B: ")
		leia(b)
		escreva("Digite quanto vale o C: ")
		leia(c)
		
			r= mat.potencia (a+b, 2)
			s= mat.potencia (b+c, 2)

			d= (r+s)/2
			
		escreva("\nO valor de D é igual a: " , d , ".\n")
	
}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 144; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */