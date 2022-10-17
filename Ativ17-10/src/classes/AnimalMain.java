package classes;

import java.util.ArrayList;

public class AnimalMain {

	public static void main(String[] args) {
		Gato g1 = new Gato();
		Gato g2 = new Gato();
		Gato g3 = new Gato();
		
		Cachorro c1 = new Cachorro();
		Cachorro c2 = new Cachorro();
		Cachorro c3 = new Cachorro();
		
		g1.setNome("Tom");
		g1.setRaca("Azul Russo");
		g1.setnPatas(4);
		g1.setCor("Cinza");
		g1.setComprimento((float)50);
		g1.setEcossistema("Casa");
		
		g2.setNome("Garfield");
		g2.setRaca("Persa");
		g2.setnPatas(4);
		g2.setCor("Laranja");
		g2.setComprimento((float)80);
		g2.setEcossistema("Casa");
		
		g3.setNome("Mingau");
		g3.setRaca("Angorá");
		g3.setnPatas(4);
		g3.setCor("Branco");
		g3.setComprimento((float)70);
		g3.setEcossistema("Apartamento");
		
		c1.setNome("Bidu");
		c1.setRaca("Scottish Terrier");
		c1.setnPatas(4);
		c1.setCor("Azul");
		c1.setComprimento((float)70);
		c1.setEcossistema("Apartamento");
		
		c2.setNome("Scooby");
		c2.setRaca("Dogue Alemão");
		c2.setnPatas(4);
		c2.setCor("Marrom");
		c2.setComprimento((float)90);
		c2.setEcossistema("Campo");
		
		c3.setNome("Snoopy");
		c3.setRaca("Beagle");
		c3.setnPatas(4);
		c3.setCor("Branco manchado");
		c3.setComprimento((float)60);
		c3.setEcossistema("Casa");
		
	    ArrayList<Gato> listaFelina = new ArrayList<>();
		ArrayList<Cachorro> listaCanina = new ArrayList<>();
		
		listaFelina.add(g1);
		listaFelina.add(g2);
		listaFelina.add(g3);
		
		listaCanina.add(c1);
		listaCanina.add(c2);
		listaCanina.add(c3);
		
		for (Gato gato : listaFelina) {
			System.out.println("Nome: "+gato.getNome());
			System.out.println("Raça: "+gato.getRaca());
			System.out.println("Número de Patas:"+gato.getnPatas());
			System.out.println("Cor: "+gato.getCor());
			System.out.println("Comprimento:"+gato.getEcossistema());
			System.out.println("Ecossistema: "+gato.getEcossistema());
			gato.mia();
		}
		
		for (Cachorro cachorro : listaCanina) {
			System.out.println("Nome: "+cachorro.getNome());
			System.out.println("Raça: "+cachorro.getRaca());
			System.out.println("Número de Patas:"+cachorro.getnPatas());
			System.out.println("Cor: "+cachorro.getCor());
			System.out.println("Comprimento:"+cachorro.getEcossistema());
			System.out.println("Ecossistema: "+cachorro.getEcossistema());
			cachorro.latir();
		}
		
		

		
	}
}
