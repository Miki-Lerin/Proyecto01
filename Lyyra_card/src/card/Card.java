package card;

public class Card {
	
    private String numcard;
    private String owner;
	private double balance;

	public Card(String numcard, String owner, double balance) {
		this.numcard = numcard;
		this.owner = owner;
		this.balance = balance;
	}

	public String getNumcard() {
		return numcard;
	}
	
	public String getOwner() {
		return owner;
	}

	
	public void setNumcard(String numcard) {
		this.numcard = numcard;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
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
    
    public boolean pay(double amount) {
    	if (balance < amount) {
    		return false;
    	}
    	
    	return true;
    }
    
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Card [numcard=" + this.numcard + ", owner=" + this.owner + ", balance=" + this.balance + "]";
	}



}
