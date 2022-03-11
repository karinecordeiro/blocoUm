package POO;

public class ObjetoPaciente {

	public static void main(String[] args) {
		Paciente pc1 = new Paciente();
		Paciente pc2 = new Paciente();
		Paciente pc3 = new Paciente();
		
		System.out.println("Niveis de gravidade: 'vermelho', 'amarelo', 'azul'\n");
		
		pc1.nome="Maria";
		pc1.senha=5;
		pc1.gravidade="vermelho";
		pc1.fila();
		
		pc2.nome="João";
		pc2.senha=8;
		pc2.gravidade="amarelo";
		pc2.fila();
		
		pc2.nome="Paul";
		pc2.senha=11;
		pc2.gravidade="azul";
		pc2.fila();
		
		
		
		
	}

}
