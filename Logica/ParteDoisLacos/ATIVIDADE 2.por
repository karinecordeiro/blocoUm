/*Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário.
E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50 calcule o excesso
de pagamento armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00.
No final do processamento imprimir o salário total e o salário excedente.*/

programa
{
	
	funcao inicio()
	{
		inteiro codigoFunc, numeroHoras, valorHoras=10, excessoHoras=20, valorSalario, valorTotal, horaExtra, totalExtra
		escreva("SISTEMA DOIS\n")
		escreva("\nDigite seu cógido de funcionário: ")
		leia(codigoFunc)
		escreva("\nDigite seu número de horas trabalhadas: ")
		leia(numeroHoras)
		valorSalario= numeroHoras*valorHoras
		horaExtra= numeroHoras-50
		totalExtra= excessoHoras*horaExtra
		valorTotal= totalExtra + 500
		
			se (numeroHoras>50)
				{
				escreva("\nFuncionário: " ,codigoFunc)
				escreva("\nSeu salário total é de: " ,valorTotal, " reais.")
				escreva("\nSeu salário extra é de: " ,totalExtra, " reais.\n")
				}
			senao
				{
				escreva("\nFuncionário: " ,codigoFunc)
				escreva("\nSeu salário total é de: " ,valorSalario, " reais.")
				escreva("\nSeu salário extra é de: 0,00 reais.\n")
				}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1293; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */