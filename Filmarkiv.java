package no.hvl.data102;

import java.util.Arrays;

import no.hvl.data102.adt.FilmarkivADT;

public class Filmarkiv<T> implements FilmarkivADT<T> {
	 private T[] arkiv;
	 private int antall; 
	 
	public Filmarkiv() {
		}
	
	public Filmarkiv(int filmKapasitet) {
		arkiv = (T[])(new Object[filmKapasitet]);
		this.antall = 0;
	}
	
	private void utvid() {
		T[] utvidetArkiv = (T[])(new Object[arkiv.length * 2]);
		for(int i = 0; i < arkiv.length; i++) {
			utvidetArkiv[i] = arkiv[i];
		}
		arkiv = utvidetArkiv;
	}

	private Film[] trimTab(Film[] tab, int n) {
		Film[] nytab = new Film[n];
		int i = 0; 
		while (i < n) {
			nytab[i] = tab[i];
			i++;
		}
		return nytab;
	}
	
	@Override
	public void visFilm(int nr) {
		for(int i = 0; i < arkiv.length; i++) {
			if(((Film)arkiv[i]).getFilmnr() == nr) {
				System.out.println(i);
			}
		}
	}

	@Override
	public void leggTilFilm(Film nyFilm) {
		if(arkiv.length <= antall) {
			utvid();
		}
		arkiv[antall] = (T) nyFilm;
		antall++;
		}
		

	@Override
	public boolean slettFilm(int filmnr) {
		boolean slettet = false; 
		for(int i = 0; i < arkiv.length; i++) {
			if(arkiv[i].equals(filmnr)) {
				arkiv[i] = null;
				slettet = true;
			}
		}
		return slettet;
	}

	@Override
	public int antall(Sjanger sjanger) {
		        int sum = 0;
		        for (T f : arkiv){
		            if (((Object) f).equals(sjanger))	{
		                sum++;
		            }
		        }
		        return sum;
		    }

	@Override
	public int antall() {
		return antall;
	}

	@Override
	public Film[] soekTittel(String delstreng) { 
		if(Arrays.asList(arkiv).contains(delstreng)) {
			System.out.println("Arkivet inneholder: " + delstreng);
		}
		return null;
	}

	@Override
	public boolean erTom() {
		return antall == 0;
	}

}
