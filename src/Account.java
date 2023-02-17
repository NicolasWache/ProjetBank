import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

public class Account {

	private int accountNumber;
	private static  AtomicInteger ID_FACTORY = new AtomicInteger(10101520);
	private int sold;
	private int ownerUserId;
	private LocalDate date;
	private User user;
	
	public Account (int sold, int ownerUserId, User user) {
		this.accountNumber = ID_FACTORY.getAndIncrement();
		this.date = java.time.LocalDate.now();
		this.sold = sold;
		this.ownerUserId = ownerUserId;
		this.user=user;
	}
	
	public Account (int sold, int ownerUserId) {
		this.accountNumber = ID_FACTORY.getAndIncrement();
		this.date = java.time.LocalDate.now();
		this.sold = sold;
		this.ownerUserId = ownerUserId;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getSold() {
		return sold;
	}

	public void setSold(int sold) {
		this.sold = sold;
	}

	public int getOwnerUserId() {
		return ownerUserId;
	}

	public void setOwnerUserId(int ownerUserId) {
		this.ownerUserId = ownerUserId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	

	@Override
	public String toString() {
		return "Proprietaire du compte=" + user.getFirstName()+ " " + user.getLastName()+" Numéro de compte " + accountNumber + " Solde=" + sold + ", "  + ", date de Création du compte: "
				+ date + "]";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
}