/**faça um programa que crie um vetor por leitura com 5 valores
 * de pontuação de uma atividade e o escreva em seguida.
 * Encontre após a maior pontuação e a apresente.
 */

programa
{
	
	funcao inicio()
	{
		escreva("SISTEMA UM\n")

		
		inteiro vetor[5], valorMaior=0
		para (inteiro x=0; x<5;x++){
			escreva("\nDigite o valor: ")
			leia(vetor[x])
			}
		valorMaior = vetor [0]
		para (inteiro x=0; x<5;x++){
			se(valorMaior < vetor[x]){
				valorMaior = vetor[x]
				
				}
		
			}
			limpa()
			escreva("\nO MAIOR VALOR É: ", valorMaior,"\n")
		
		}
		

}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 506; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */