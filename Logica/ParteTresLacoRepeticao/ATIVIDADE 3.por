 /*Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório,
 a média e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto o usuário estiver 
 fornecendo valores positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.*/


programa
{
	
	funcao inicio()
	{
		escreva("SISTEMA TRÊS\n")
		
		inteiro numero=0
		real media, soma=0,contador=0
		
		enquanto(numero>=0)
			{
			escreva("\nDigite um número positivo: ")
			leia(numero)
			soma +=numero
			contador++
			}

			escreva("\n\nA soma de todos os valores é de: ",soma, "\n")

			media=soma/contador
			escreva("\nA média dos valores é de: ",media,"\n")

			escreva("\nO total de valores lidos é de: ",contador, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 576; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */