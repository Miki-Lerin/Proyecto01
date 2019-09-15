package PackPLA2PAC1;

public class Credit extends Card{
	
	private int creditLimit;
	private static final int limitCard = 444;

	public Credit(String numCard, String cvv, Fecha fechaExpiracion, 
			      String numCta, int creditLimit) {
		
		super(numCard, cvv, fechaExpiracion, numCta);
		this.creditLimit = creditLimit;
	}
	
	public Credit(String numCard, String cvv, Fecha fechaExpiracion, 
		      String numCta) {
	
	super(numCard, cvv, fechaExpiracion, numCta);
	this.creditLimit = limitCard;
	}

	public void increaseCreditLimit(int amount) {
		creditLimit += amount;
	}
	
	public void printCurrentLimit() {
		System.out.println("CREDIT -> The current limit of your card is: " + creditLimit);
	//	Syso (pulsar intro barra para System.out.println)
	}

	public int getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}
}
