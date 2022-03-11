package POO;

public class ObjetoContaBancaria {

	public static void main(String[] args) {

		ContaBancaria c1 = new ContaBancaria();
		
		c1.codigoCliente=1;
		c1.entrada=1200;
		c1.saida=500;
		c1.saldoFinal();
		
		c1.codigoCliente=2;
		c1.entrada=300;
		c1.saida=400;
		c1.saldoFinal();
		
		c1.codigoCliente=3;
		c1.entrada=200;
		c1.saida=0;
		c1.saldoFinal();
		
		c1.codigoCliente=4;
		c1.entrada=0;
		c1.saida=1500;
		c1.saldoFinal();
	}

}
