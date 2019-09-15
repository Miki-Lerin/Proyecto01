package PackPLA2PAC1;

public class Card {
	
	private String numCard;
	private String cvv;
	private Fecha fechaExpiracion;
	private String numCta;
	
	public Card(String numCard, String cvv, Fecha fechaExpiracion, String numCta) {
		this.numCard = numCard;
		this.cvv = cvv;
		this.fechaExpiracion = fechaExpiracion;
		this.numCta = numCta;
	}
	
	public void imprimirCard() {
		System.out.println("");
		System.out.println("Card-NUMCARD: " + numCard);
		System.out.println("Card-CVV: " + cvv);
		System.out.println("Card-FECHA EXPIRACION: " 
		            + String.valueOf(fechaExpiracion.mes).substring(0, 1) +
				"/" + String.valueOf(fechaExpiracion.año).substring(2, 4));
		System.out.println("Card-CTA: " + numCta);
	}

	public String getNumCard() {
		return numCard;
	}

	public void setNumCard(String numCard) {
		this.numCard = numCard;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public Fecha getFechaExpiracion() {
		return fechaExpiracion;
	}

	public void setFechaExpiracion(Fecha fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}

	public String getNumCta() {
		return numCta;
	}

	public void setNumCta(String numCta) {
		this.numCta = numCta;
	}
}
