package Colecao;

/*--Armazenar dados da List
--Remover dados da list;
--Atualizar dados da list.
--Apresentar todos os dados da list.*/

import java.util.ArrayList;

public class ObjetoEstoque {

	public static void main(String[] args) {
		 
			EstoqueLoja e1= new EstoqueLoja("Blusa", 16, 6);
			EstoqueLoja e2= new EstoqueLoja("Calça", 42, 11);
			EstoqueLoja e3= new EstoqueLoja("Sapato", 38, 5);
			EstoqueLoja e4= new EstoqueLoja("Vestido", 40, 2);
			EstoqueLoja e5= new EstoqueLoja("Vestido", 40, 0);
			
			ArrayList<EstoqueLoja> estoque = new ArrayList<>();
			
			estoque.add(e1);
			estoque.add(e2);
			estoque.add(e3);
			estoque.add(e4);
			
			System.out.print("ESTOQUE APRESENTADO\n");
			
			System.out.print("Adicionado "+estoque+"\n");
			
			estoque.set(3, e5);
			System.out.println("Atualizado "+estoque);
			
			estoque.remove(e5);
			System.out.println("Removido "+estoque);	
			
	}	

}
