package Colecao;

/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá 
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque.*/

public class EstoqueLoja {

		private String roupa;
		private int tamanho;
		private int quantidade;
		
		public EstoqueLoja(String r, int t, int q)
		{
			this.roupa=r;
			this.tamanho=t;
			this.quantidade=q;
		}

		public String getRoupa() {
			return roupa;
		}

		public void setRoupa(String roupa) {
			this.roupa = roupa;
		}

		public int getTamanho() {
			return tamanho;
		}

		public void setTamanho(int tamanho) {
			this.tamanho = tamanho;
		}

		public int getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}
		public String toString()
		{
			return "Estoque: "+this.roupa+". Tamanho: "+this.tamanho+". Quantidade: "+this.quantidade+ "\t";
		}
}
