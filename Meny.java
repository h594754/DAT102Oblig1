package no.hvl.data102.klient;

import no.hvl.data102.Film;
import no.hvl.data102.Sjanger;
import no.hvl.data102.adt.FilmarkivADT;

public class Meny {
	private Tekstgrensesnitt tekstgr;
	private FilmarkivADT<Integer> filmarkiv;
	
	public Meny(FilmarkivADT<Integer> filma) {
		setTekstgr(new Tekstgrensesnitt());
		this.setFilmarkiv(filma);
	}
	
	public void start() {
		Film film1 = new Film(1, "Johnny", "Danser med Geir", 2020, Sjanger.ACTION);
		Film film2 = new Film(1, "Sveinung", "Danser med stjernene", 2005, Sjanger.DRAMA);
		Film film3 = new Film(1, "Ivo", "Star Wars", 2016, Sjanger.SCIFI);
		Film film4 = new Film(1, "Simon Cap", "Ringenes Herre", 2001, Sjanger.ACTION);
		Film film5 = new Film(1, "Odd Nerdrum", "Mal en katt", 2022, Sjanger.HISTORY);
	}

	public FilmarkivADT<Integer> getFilmarkiv() {
		return filmarkiv;
	}

	public void setFilmarkiv(FilmarkivADT<Integer> filma) {
		this.filmarkiv = filma;
	}

	public Tekstgrensesnitt getTekstgr() {
		return tekstgr;
	}

	public void setTekstgr(Tekstgrensesnitt tekstgr) {
		this.tekstgr = tekstgr;
	}
}
