package heran�a;

public class ResultadoDosAnimais {
	
	public static void main (String[] args) {
		cachorro cachorro=new cachorro();
		cavalo cavalo = new cavalo();
		preguica preguica = new preguica();
		
		cachorro.setAcao("Correr");
		cachorro.setNome("Sans�o");
		cachorro.setIdade(6);
		
		cavalo.setAcao("Disparar");
		cavalo.setNome("Pe de Pano");
		cavalo.setIdade(5);
		
		
		preguica.setAcao("Subir em arvore");
		preguica.setNome("Flecha");
		preguica.setIdade(13);
		
		System.out.println("Nome do cachorro:"+cachorro.getNome()+"				Idade do cachorro:"+cachorro.getIdade()+"			A��o do cachorro:"+ cachorro.getAcao());
		System.out.println("Nome do cavalo:"+	cavalo.getNome()+"				Idade do cavalo:"+cavalo.getIdade()+"				A��o do cavalo:"+ 	cavalo.getAcao());
		System.out.println("Nome do preguica:"+preguica.getNome()+"				Idade do preguica:"+preguica.getIdade()+"			A��o do preguica:"+ preguica.getAcao());
		
		
	}

}
