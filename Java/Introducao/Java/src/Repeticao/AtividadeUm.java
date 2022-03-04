package Repeticao;

/*Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5.*/


public class AtividadeUm {

	public static void main(String[] args) {

		for(int x=1000; x<2000; x++)
			{
				if(x%11 ==5)
				{
				System.out.println("\t\n["+x+"] / 11 = " +x/11 +" \te seu resto é: [" +x%11+ "]");}
			}

	}
}
