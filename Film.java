package no.hvl.data102;

public class Film {
	private int filmnr;
	private String filmskaper;
	private String filmtittel;
	private int lansering;
	private String filmselskap;

	public Film() {
	}

	public Film(int filmnr, String filmskaper, String filmtittel, int lansering, Sjanger sjang) {
		this.filmnr = filmnr;
		this.filmskaper = filmskaper;
		this.filmtittel = filmtittel;
		this.lansering = lansering;
		sjang = null;
		
		
	}

	public int getFilmnr() {
		return filmnr;
	}

	public void setFilmnr(int filmnr) {
		this.filmnr = filmnr;
	}

	public String getFilmskaper() {
		return filmskaper;
	}

	public void setFilmskaper(String filmskaper) {
		this.filmskaper = filmskaper;
	}

	public String getFilmtittel() {
		return filmtittel;
	}

	public void setFilmtittel(String filmtittel) {
		this.filmtittel = filmtittel;
	}

	public int getLansering() {
		return lansering;
	}

	public void setLansering(int lansering) {
		this.lansering = lansering;
	}

	public String getFilmselskap() {
		return filmselskap;
	}

	public void setFilmselskap(String filmselskap) {
		this.filmselskap = filmselskap;
	}

	@Override
	public boolean equals(Object obj) {
		boolean erLik = false;
		Film f = (Film) obj;

		if (filmnr == f.filmnr) {
			erLik = true;
		}
		return erLik;
	}

	@Override
	public int hashCode() {
		Integer temp = filmnr;
		return temp.hashCode();
	}
}
