/*Desenvolva um sistema em que:	Leia 4 (quatro) números; 	Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.*/

programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		escreva("SISTEMA 3.2\n")
		inteiro n1 , n2, n3, n4, q1, q2, q3, q4
		
		escreva("\nDigite o primeiro valor: ")
		leia(n1)
		
		escreva("Digite o segundo valor: ")
		leia(n2)

		escreva("Digite o terceiro valor: ")
		leia(n3)
		
		escreva("Digite o quarto valor: ")
		leia(n4)
		

		q1= mat.potencia (n1, 2)
		q2= mat.potencia (n2, 2)
		q3= mat.potencia (n3, 2)
		q4= mat.potencia (n4, 2)
		 
		 se (q3>=1000)
				{
					limpa()
				escreva("\nO terceiro valor é: ",q3,"\n")
				}
		 senao
			{
				limpa()
			escreva("\nO quadrado de ", n1, " é igual a ", q1)
			escreva("\nO quadrado de ", n2, " é igual a ", q2)
			escreva("\nO quadrado de ", n3, " é igual a ", q3)
			escreva("\nO quadrado de ", n4, " é igual a ", q4, "\n")
			}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 243; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */