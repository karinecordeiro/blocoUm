programa
{
	
	funcao inicio()
	{
		inteiro numeroUsuario , novoResultado 
		escreva("SISTEMA QUATRO\n")
		escreva("\nDigite um número: ")
		leia(numeroUsuario)
		novoResultado=numeroUsuario*3
		escreva("\nO número: " ,numeroUsuario," X " ,3, " é = " ,novoResultado,"\n")
		
		enquanto(novoResultado<=100)
		{
			escreva("\nO número ",novoResultado, " X " ,3, " é = ",novoResultado*=3, "\n")
		}

		
	}
	}
	
	
		
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 395; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */