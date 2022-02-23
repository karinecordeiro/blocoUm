/**
 *  um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere
 *  um vetor com os lançamentos, ecreva esse vetor. A seguir determine e imprima a média aritmética
 *  dos lançamentos, contabilize e apresente também quantas foram as ocorrências da
 *  maior pontuação.
*/


programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		escreva("SISTEMA DOIS\n")

		inteiro vetor[10], soma=0, maiorPontuacao=0, x, media=0, contador=0

		
		para (x=0;x<10;x++)
		{
			vetor[x]= Util.sorteia(1, 6)
			se(vetor[x]>maiorPontuacao)
				maiorPontuacao=vetor[x]
			escreva("\t[ ",vetor[x]," ]")
			soma +=vetor[x]
			
		}
		para (x=0;x<10;x++)
		{
			se(vetor[x]==maiorPontuacao)
			contador++
		}
		media= soma/10	
		escreva("\n\nA média aritmética e de: ",media, "\n")
		
		escreva("\n\nA maior pontuação aconteceu: ",contador,"\n")
	
		
	}
				
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 792; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */