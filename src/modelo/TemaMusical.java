package modelo;

import java.util.Calendar;

public class TemaMusical {
	//Id;Title;Artist;Year;Duo;Explicit;"Date Added";Styles;Languages
	
	int Id,Duo,Explicit;
	String Artist,Title,Styles,Lenguages;
	Calendar Year,DateAdded;
	public TemaMusical(int id, String title, String artist, Calendar year, int duo, int explicit, Calendar dateAdded,
			String styles, String lenguages) {
		super();
		Id = id;
		Title = title;
		Artist = artist;
		Year = year;
		this.Duo = duo;
		Explicit = explicit;
		DateAdded = dateAdded;
		Styles = styles;
		Lenguages = lenguages;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getDuo() {
		return Duo;
	}
	public void setDuo(int duo) {
		Duo = duo;
	}
	public int getExplicit() {
		return Explicit;
	}
	public void setExplicit(int explicit) {
		Explicit = explicit;
	}
	public String getArtist() {
		return Artist;
	}
	public void setArtist(String artist) {
		Artist = artist;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getStyles() {
		return Styles;
	}
	public void setStyles(String styles) {
		Styles = styles;
	}
	public String getLenguages() {
		return Lenguages;
	}
	public void setLenguages(String lenguages) {
		Lenguages = lenguages;
	}
	public Calendar getYear() {
		return Year;
	}
	public void setYear(Calendar year) {
		Year = year;
	}
	public Calendar getDateAdded() {
		return DateAdded;
	}
	public void setDateAdded(Calendar dateAdded) {
		DateAdded = dateAdded;
	}
	
	
	
	

}
