package POO;

public class ObjetoPatinete {

	public static void main(String[] args) {
	Patinete pat1 = new Patinete ("Rosa", true);
	Patinete pat2 = new Patinete ("Verde", false);	
	
		pat1.movimento();
		System.out.print("\n");
		pat2.movimento();
		

	}

}
