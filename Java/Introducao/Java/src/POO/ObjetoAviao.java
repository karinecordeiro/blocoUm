package POO;

public class ObjetoAviao {

	public static void main(String[] args) {
		
	
		Aviao av1 = new Aviao(240);
		
		System.out.print("O modelo do avi�o �: "+ av1.modelo+ "\n");
		System.out.print("O velocidade do avi�o �: "+ av1.velocidade+ "\n");

		
			av1.decolar();		
		
			av1.pousar();
		

	}

}
