package restaurant;

public class Moviment {
	
	private String date;
	private String tipmov;
	private String concep;
	private Double dineroCaja;
	
	public Moviment(String date, String tipmov, String concep, Double dineroCaja) {
		this.date = date;
		this.tipmov = tipmov;
		this.concep = concep;
		this.dineroCaja = dineroCaja;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
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

	public Double getDineroCaja() {
		return dineroCaja;
	}

	public void setDineroCaja(Double dineroCaja) {
		this.dineroCaja = dineroCaja;
	}

	@Override
	public String toString() {
		return "Moviment [date=" + date + ", tipmov=" + tipmov + ", concep=" + concep + ", dineroCaja=" + dineroCaja
				+ "]";
	}
}