package heran�a;

public class TabelaPizzria {
	
	
	public static void main (String[] args) {
	// Cria��o dos vetores, j� com os dados inicializados
			String nome []= {("Mussarela", "Calabresa" , "Margherita", "Portuguesa", "Bacon")};
			double altura []= { 21.99, 21.99, 19.99, 27.99, 25.99 };

			// Cria o cabe�alho da tabela
			System.out.println ("--------------------\n");
			System.out.println ("       TABELA       \n");
			System.out.println("--------------------\n");
  
			for (int posicao = 0; posicao < 5; posicao++)
			{
				System.out.println(nome[posicao]);
				
			}
		}
	}
