package PackPLA2PAC1;

public class Tarjeta {
	
    private String numtarjeta;
	private double balance;

	public Tarjeta(String numtarjeta, double balance) {
		this.numtarjeta = numtarjeta;
		this.balance = balance;
	}

	public void setNumtarjeta(String numcard) {
		this.numtarjeta = numcard;
	}
	
	public double balance() {
        return this.balance;
    }

    public void loadMoney(double amount) {
        this.balance += amount;
    }
    
    public void withdrawals(double amount) {
    	this.balance -= amount;
    }
    
	public String getNumtarjeta() {
		return numtarjeta;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Tarjeta [numtarjeta=" + numtarjeta + ", balance=" + balance + "]";
	}
}
