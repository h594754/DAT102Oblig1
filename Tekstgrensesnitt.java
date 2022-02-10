package no.hvl.data102.klient;

import java.util.Scanner;
import no.hvl.data102.Film;
import no.hvl.data102.Sjanger;
import no.hvl.data102.adt.FilmarkivADT;

public class Tekstgrensesnitt {
	// lese opplysningene om en FILM fra tastatur

	public Film lesFilm() {
		Scanner tastatur = new Scanner(System.in);
		System.out.println("Skriv inn navnet på en film: ");
		String filmnavn = tastatur.nextLine();
		System.out.println("Du skrev" + filmnavn);
		return null;

	}

	public void visFilm(Film film) {
		System.out.println(film);
	}

	public void skrivUtFilmDelstrengITittel(FilmarkivADT<String> filma, String delstreng) {
		System.out.println(filma.equals(delstreng));
	}

	public void skrivUtFilmProdusent(FilmarkivADT<String> filma, String delstreng) {
		Film produsent = new Film();
		System.out.println(produsent.getFilmselskap());
	}

	public void skrivUtFilmStatistikk(FilmarkivADT<String> filma, Sjanger sjanger) {
		
		System.out.println("Antall filmer er" + filma.antall() +"\n");
		System.out.println("Antall ACTION er" + filma.antall(sjanger.ACTION));
		System.out.println("Antall DRAMA er" + filma.antall(sjanger.DRAMA));
		System.out.println("Antall HISTORY er" + filma.antall(sjanger.HISTORY));
		System.out.println("Antall SCIFI er" + filma.antall(sjanger.SCIFI));
	}
}
