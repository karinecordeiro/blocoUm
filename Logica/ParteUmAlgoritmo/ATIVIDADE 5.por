/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
 Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. */
programa
{
	
	funcao inicio()
	{
	real nota1, nota2, nota3, media
		escreva("SISTEMA CINCO\n")
		escreva("\nNota um do alune: ")
		leia(nota1)
		escreva("Nota dois do alune: ")
		leia(nota2)
		escreva("Nota três do alune: ")
		leia(nota3)

		media = (nota1*2 + nota2*3 + nota3*5)/10

		escreva("\nA média do alune é de: " , media , "\n")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 181; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */