package restaurant;

import java.text.DateFormat;

public class Moviment {
	
	private String date;
	private int nummov;
	private String tipmov;
	private String concep;
	private Double price;
	
	public Moviment(String date, int nummov, String tipmov, String concep, Double price) {
		this.date = date;
		this.nummov = nummov;
		this.tipmov = tipmov;
		this.concep = concep;
		this.price = price;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getNummov() {
		return nummov;
	}

	public void setNummov(int nummov) {
		this.nummov = nummov;
	}

	public String getTipmov() {
		return tipmov;
	}

	public void setTipmov(String tipmov) {
		this.tipmov = tipmov;
	}

	public String getConcep() {
		return concep;
	}

	public void setConcep(String concep) {
		this.concep = concep;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Moviment [date=" + this.date + ", nummov=" + this.nummov + ", tipmov=" + this.tipmov + ", concep=" + this.concep
				+ ", price=" + this.price + "]";
	}
}