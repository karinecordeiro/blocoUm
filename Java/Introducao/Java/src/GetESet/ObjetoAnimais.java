package GetESet;

public class ObjetoAnimais {

	public static void main(String[] args) {
		Cachorro cc1 = new Cachorro();
		Cavalo cv1 = new Cavalo();
		Preguica p1 = new Preguica();
		
		cc1.setNome("Dog");
		cc1.setIdade(5);
		cc1.setSom(true);
		cc1.setCorrer(true);
		
		cv1.setNome("Horse");
		cv1.setIdade(15);
		cv1.setSom(true);
		cv1.setCorrer(true);
		
		p1.setNome("Sloth");
		p1.setIdade(7);
		p1.setSom(true);
		p1.setSubir(true);
		
		
			System.out.print("O nome do cachorro é " +cc1.getNome()+ ", sua idade é " +cc1.getIdade()+ 
								" anos. Ele emite som: ["+cc1.isSom()+"] e ele corre [" +cc1.isCorrer()+ "].\n");
			System.out.print("\nO nome do cavalo é " +cv1.getNome()+ ", sua idade é " +cv1.getIdade()+ 
					" anos. Ele emite som: ["+cv1.isSom()+"] e ele corre [" +cv1.isCorrer()+ "].\n");
			System.out.print("\nO nome da preguiça é " +p1.getNome()+ ", sua idade é " +p1.getIdade()+ 
					" anos. Ela emite som: ["+p1.isSom()+"] e ela sobe em árvores [" +p1.isSubir()+ "].");
	}

}
