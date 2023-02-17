import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

public class Operation {

	//attributs
	LocalDate date = java.time.LocalDate.now();
	protected static final AtomicInteger ID_FACTORY = new AtomicInteger(200);
	protected int idOperation;
	private double transactionAmount;
	private char type;
	int accountId;
	int userId;
	
	//constructeurs
	public Operation(int userId, int accountId, double amount, char type) {
		this.userId = userId;
		setAccountId(accountId);
		setTransactionAmount(amount);
		setType(type);
		idOperation = ID_FACTORY.getAndIncrement();
	}
	
	//accesseurs

	public double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public char isType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	//méthodes
	public String toString() {
		if(type == '+') {
			return "Opération n°"+ idOperation + "\nCompte : " + getAccountId() + "\nDate : " + date + "\nMontant : +" + getTransactionAmount();
		}
		return "Opération n°"+ idOperation + "\nCompte : " + getAccountId() + "\nDate : " + date + "\nMontant : -" + getTransactionAmount();
	}
	
	
}
