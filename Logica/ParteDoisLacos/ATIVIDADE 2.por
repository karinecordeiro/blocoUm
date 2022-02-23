programa
{
	
	funcao inicio()
	{
		inteiro codigoFunc, numeroHoras, valorHoras, excessoHoras, valorTotal, horaExtra, valorExtra, valorSalario
		escreva("SISTEMA DOIS\n")
		escreva("\nDigite seu cógido de funcionário: ")
		leia(codigoFunc)
		escreva("\nDigite seu número de horas trabalhadas: ")
		leia(numeroHoras)
		valorHoras=10
		excessoHoras=20
		horaExtra= numeroHoras-50
		valorSalario= valorHoras*50
		valorTotal= (numeroHoras*valorHoras) + (numeroHoras*excessoHoras)/2 - 500
		valorExtra= valorTotal-valorSalario
	
		
		
		se (numeroHoras>50)
		{
		escreva("\nFuncionário: " ,codigoFunc)
		escreva("\nSeu salário total é de: " ,valorTotal, " reais.")
		escreva("\nSeu salário extra é de: " ,valorExtra, " reais.\n")
		
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 568; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */