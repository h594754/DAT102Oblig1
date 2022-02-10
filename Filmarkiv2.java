package no.hvl.data102;

import no.hvl.data102.adt.FilmarkivADT;

public class Filmarkiv2<T> implements FilmarkivADT<T> {
	private int antall; 
	private LinearNode<Film> start; 

	public Filmarkiv2() {
		antall = 0; 
		start = null;
		
	}

	@Override
	public void visFilm(int nr) {
		LinearNode<Film> finne = start; 
		if(finne.equals(nr)) {
			System.out.println(finne.getElement().getFilmtittel());
		} else {
			System.out.println("Den eksisterer ikke");
		}
	}
		 

	@Override
	public void leggTilFilm(Film nyFilm) {
		LinearNode<Film> nyfilm = new LinearNode<>();
		nyfilm.setNeste(start);
		start = nyfilm;
		antall++;
		
	}

	@Override
	public boolean slettFilm(int filmnr) {
		Film resultat = null; 
		LinearNode<Film> node = finnNode(filmnr);
		if(node != null) {
			resultat = node.getElement();
			Film startEl = start.getElement();
			node.setElement(startEl);
			start = start.getNeste();
			antall--; 
		}
		return false;
	}

	@Override
	public Film[] soekTittel(String delstreng) {
		Film tittel = null;
		while(tittel != null) {
			if(tittel.equals(delstreng)) {
				System.out.println("Denne filmen finnes: " + tittel);
			}
		}
		return null;
	}

	@Override
	public int antall(Sjanger sjanger) {
		return this.antall(sjanger);
	}

	@Override
	public int antall() {
		return antall; 
	}
	
	
	
	private LinearNode<Film> finnNode(int filmnr) {
		boolean funnet = false;
		LinearNode<Film> node = null;
		LinearNode<Film> aktuell = start;
		for (int i = 0; i < antall && !funnet; i++) {
			if (aktuell.getElement().equals(filmnr)) {
				funnet = true;
				node = aktuell;
			} else {
				aktuell = aktuell.getNeste();
			}
		}
		return node;
	}

	@Override
	public boolean erTom() {
		return antall == 0; 
	}

}
