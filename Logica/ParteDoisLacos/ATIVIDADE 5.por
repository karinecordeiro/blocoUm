/*A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de indústrias que são altamente poluentes 
do meio ambiente. O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do
1º grupo são intimadas a suspenderem suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo são 
intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. 
Faça um sistema que leia o índice de poluição medido e emita a notificação adequada aos diferentes grupos de empresas.*/

programa
{
	
	funcao inicio()
	{
		real indice
		
		escreva("SISTEMA CINCO\n")
		escreva("\nDigite o índice de poluição medido: ")
		leia(indice)
		
		se(indice >=0.05 e indice<=0.25)
			{
			limpa()
			escreva("\nSeu índice de poluição está na faixa de " ,indice,", portanto é aceitável!\n") 	
			}
		senao se(indice >=0.26 e indice<=0.29)
			{
			limpa()
			escreva("\nSeu índice de poluição está na faixa de: ",indice,"\n") 	
			}
		senao se(indice >=0.3 e indice<=0.39)
			{
			limpa()
			escreva("\nSeu índice de poluição está na faixa de: ",indice,", contanto, GRUPO 1 é necessária a suspensão de atividades.\n") 	
			}
		senao se(indice >=0.4 e indice<=0.49)
			{
			limpa()
			escreva("\nSeu índice de poluição está na faixa de: ",indice,", contanto, GRUPO 1 e GRUPO 2 é necessária a suspensão de atividades.\n") 	
			}
		senao 
			{
			limpa()
			escreva("\nSeu índice de poluição está na faixa de: ",indice,", contanto GRUPO 1, GRUPO 2 e GRUPO 3, é necessária a paralisação de atividades.\n") 
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 919; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */