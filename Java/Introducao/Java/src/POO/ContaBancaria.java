package POO;

/*Crie uma classe conta bancaria e apresente os atributos e métodos referentes esta classe,
em seguida crie um objeto conta bancaria, defina as instancias deste objeto e apresente
as informações deste objeto no console.*/

public class ContaBancaria {

	double entrada, saida, saldo;
	int codigoCliente;
	
	public void entrou()
	{
		System.out.print("A entrada foi de: "+entrada);
	}
	public void saiu()
	{
		System.out.print("A saída foi de: "+saida);
	}
	public void saldoFinal()
	{
		this.saldo=(this.entrada-this.saida);
		System.out.print("Cliente "+codigoCliente+", você depositou: "+entrada+" e retirou: "+saida+". Seu saldo é de: "+saldo+"\n");
		
	}
}
