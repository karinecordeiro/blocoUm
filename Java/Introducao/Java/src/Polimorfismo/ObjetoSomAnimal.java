package Polimorfismo;

public class ObjetoSomAnimal {

	public static void main(String[] args) {
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica sloth = new Preguica();
		
		dog.som();
		horse.som();
		sloth.som();
	}

}
