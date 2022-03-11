package Teste;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class teste2{
	
public static void main(String[] args) {
	
			
			Guerreiro g1 = new Guerreiro();
			TesteInimigo goblin=new TesteInimigo();
			TesteInimigo boss =new TesteInimigo();
		
		Scanner ler = new Scanner(System.in);
		String x, name;
		int y,y1,y2,y3,y4,y5,y6,d=0, e=1;//y5=PRIMEIRA BATALHA y6=SEGUNDA BATALHA
		boolean batalha1=false, batalha2=false;
		ArrayList<PerfilJogador> perfil = new ArrayList<>();
		
		System.out.println("DIGITE SEU NOME");
		name=ler.next();
		PerfilJogador guerreiro = new PerfilJogador(name, 60, 16);
		System.out.println("BEM VINDO AVENTUREIRE!");
		System.out.println("\nPara prosseguir aperte '.'");
		x=ler.next();
		System.out.println("\tMORADOR LOCAL DA VILA:{Guerreiro, nossa vila precisa de água. Poderia ir buscar para nos ajudar?}");
		x=ler.next();
		System.out.println("\tMORADOR LOCAL DA VILA:{Existe um rio logo depois da floresta, leve este balde... Aaaaah..\n"
				+ "Monstros costumam aparecer por lá. Tenha cuidado!}");
		x=ler.next();
		System.out.println("...'"+name+" SAI DA VILA'...");
		x=ler.next();
		perfil.add(guerreiro);
		System.out.println(perfil);
		x=ler.next();
		System.out.println("\tANDARILHO:{Psiu... Você ai...}");
		x=ler.next();
		System.out.println("\t"+name+":[Eu?]");
		x=ler.next();
		System.out.println("\tANDARILHO:{Isso.. Você parece forte e destemido. Tenho algo para você...}"
				+ "\nMas só se me ajudar...}");
		x=ler.next();
		System.out.println("\t"+name+":[E para que quer a minha ajuda?]");
		x=ler.next();
		System.out.println("\tANDARLIHO:{Meu filho se perdeu na caverna, próximo ao rio. Poderia ir encontrá-lo?}");
		x=ler.next();
		System.out.println("\t"+name+":[O que ganho com isso?]");
		x=ler.next();
		System.out.println("\tANDARILHO:{Pode escolher um desses 3 itens}");
		x=ler.next();
		System.out.println("\tANDARILHO:{Vai me ajudar?}");
		x=ler.next(); 
		try {
			do { System.out.println("DIGITE '1' PARA SIM E '2' PARA NÃO");
				y=ler.nextInt();
			if (y==1) { System.out.println("\tANDARILHO:{Ainda bem que posso contar com você!}");
			x=ler.next();	
			} else if (y==2) {
				System.out.println("..."+name+" FOI BUSCAR GUA E ACABOU SENDO GOLPEADO POR UM MONSTRO...");
				System.out.println("..."+name+" MORREU!!!...");
				System.out.println("");
				System.out.println("!!!!!FIM DO JOGO!!!!!!");
				System.exit(2);
			}} while (y!=1 && y!=2);
			}catch(InputMismatchException erro) {
				System.out.println("!!!ERRO!!!");
				System.out.println("DIGITE UM VALOR VALIDO");
				System.exit(e);
			}
		System.out.println("\tANDARILHO:{Aqui... Escolha seu item...}");
		try {
			do { System.out.println("1-ESPADA.\n2-ADAGA.\n3-MAÇA.");
		y1=ler.nextInt();
				if(y1==1) {
				System.out.println(name+" escolheu a ESPADA");
				g1.soma(5, 5, 5);
				x=ler.next();	
				boss.setHpHeroi(75);
				goblin.setHpHeroi(75);
				d=y1;
				}
			else if(y1==2) {
				System.out.println(name+" escolheu a ADAGA");
				g1.soma(2, 2, 2, 2);
				x=ler.next();
				}
			else if(y1==3) {
				System.out.println(name+" escolheu o MAÇA");
				g1.soma(7, 7);
				x=ler.next();
				}} while (y1!=1 && y1!=2 && y1!=3);
		}catch(InputMismatchException erro) {
			System.out.println("!!!ERRO!!!");
			System.out.println("DIGITE UM VALOR VALIDO");
			System.exit(e);
		}
		System.out.println("\tANDARILHO:{Boa escolha jovem. A caverna fica logo após a floresta..."
				+ " Boa sorte...}");
		x=ler.next();
		System.out.println("...'"+name+" VAI PARA CAVERNA'...");
		x=ler.next();
		System.out.println("...'NO MEIO DO CAMINHO'...");
		x=ler.next();
		System.out.println("\tGOBLIN:{Ora, ora, ora. O que temos aqui?}");
		x=ler.next();
		System.out.println("\t"+name+":[Está falando comigo?]");
		x=ler.next();
		System.out.println("\tGOBLIN:{Está vendo algúm além de você, sozinho, nesta floresta?}");
		x=ler.next();
		System.out.println("\tGOBLIN:{Parece que o gato comeu sua língua.}");
		x=ler.next();
		System.out.println("...'"+name+" CONTINUA CAMINHANDO'...");
		x=ler.next();
		System.out.println("\tGOBLIN:{Aonde você pensa que vai?}");
		x=ler.next();
		System.out.println("\t"+name+":[Seguir o meu caminho.]");
		x=ler.next();
		System.out.println("\tGOBLIN:{Apenas por cima do meu cadáver!}");
		x=ler.next();
		try {
			do {
			System.out.println("DIGITE '1' PARA BATALHA OU '2' PARA FUGIR");
			y2=ler.nextInt();
			if(y2==1) {
				System.out.println("...'BATALHA INICIADA'...");
				System.out.println("...'O GOBLIN RAIVOSO GRUNHE FEROZMENTE'...");
			} else if (y2==2) {
				System.out.println("...'"+name+" TENTA FUGIR E É APUNHALADO PELAS COSTAS'...");
				System.out.println("");
				System.out.println("...'"+name+" MORRE!!!'...");
				System.out.println("");
				System.out.println("!!!!!FIM DO JOGO!!!!!");
				System.exit(2);
			}} while (y2!=1 && y2!=2);	} catch(InputMismatchException erro) {
				System.out.println("!!!ERRO!!!");
				System.out.println("DIGITE UM VALOR VALIDO");
			}
		try {
			do {
			System.out.println("DIGITE '1' PARA ATACAR");
			y5=ler.nextInt();
			if(y5==1) {
				g1.atacar();
				System.out.println("");
				goblin.atacar();
			} } while(g1.getVidaInimigo()>=4);
		}catch(InputMismatchException erro) {
			System.out.println("!!!ERRO!!!");
			System.out.println("DIGITE UM VALOR VALIDO");
			System.exit(e);
		}
			
			System.out.println("...'VITÓRIA'...");
			x=ler.next();
			System.out.println("\t"+name+":[Os itens do Goblin estão brilhando...]\n'"+name+" PEGA OS ITENS'\n"
					+ "[Me sinto mais forte com eles...]");
			
						g1.setAtaqueHeroi(g1.getAtaqueHeroi()+5);
						g1.setDefesaHeroi(g1.getDefesaHeroi()+10);
						g1.setHpHeroi(g1.getHpHeroi()+15);
						goblin.especial();
						boss.especial();
						g1.especial();
						if(d==1) {
							boss.setHpHeroi(90);			}
						else
							boss.setHpHeroi(75);
			//Adi��o de atributos pela vit�ria	
		x=ler.next();
		System.out.println("...'"+name+" SEGUE JORNADA'...");
		x=ler.next();
		System.out.println("\tORC:{Não posso acreditar. Dois prêmios em um dia só!}");
		x=ler.next();
		System.out.println("\t"+name+":[Solte o menino!]");
		x=ler.next();
		System.out.println("\tORC:{O que você disse?}");
		x=ler.next();
		System.out.println("\t"+name+":[Solte. O. Menino!]");
		x=ler.next();
		System.out.println("\tORC:{Apenas se você me vencer!}");
		x=ler.next();
	try {
		do {
			System.out.println("DIGITE '1' PARA BATALHA OU '2' PARA TENTAR FUGIR");
			y4=ler.nextInt();
			if(y4==1) {
				System.out.println("...'BATALHA INICIADA'...");
				
				do {
					System.out.println("DIGITE '1' PARA ATACAR");
					y6=ler.nextInt();
					if(y6==1) {
						g1.atacar();
						System.out.println("");
						boss.atacar();
						boss.defender();
						System.out.println(""); 
					} } while(g1.getVidaInimigo()>=0);
			
				System.out.println("...'"+name+" VENCEU A BATALHA!'...'RESGATOU O FILHO PERDIDO, E CONSEGUIU LEVAR ÁGUA PARA VILA'...");
			} else if (y4==2) {
				System.out.println("...'"+name+" TENTA FUGIR E É ESMAGADO PELA ARMA DO ORC!!!");
				System.out.println("");
				System.out.println("...'"+name+" MORRE!!!'...");
				System.exit(2);
			}} while (y4!=1 && y4!=2);
	}catch(InputMismatchException erro) {
		System.out.println("!!!ERRO!!!");
		System.out.println("DIGITE UM VALOR VALIDO");
		System.exit(e);
	}
		System.out.println("");
		System.out.println("!!!!!FIM DO JOGO!!!!!"); 
		System.exit(e);
	}
}

