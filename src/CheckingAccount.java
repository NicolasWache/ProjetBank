public class CheckingAccount extends Account{

	private int overcraft;
	
	public CheckingAccount(int sold, int ownerUserId, User user, int overcraft) {
		super(sold, ownerUserId, user);
		this.overcraft = overcraft;
	}
	
	public CheckingAccount(int sold, int ownerUserId, int overcraft) {
		super(sold, ownerUserId);
		this.overcraft = overcraft;
	}

	public int getOvercraft() {
		return overcraft;
	}

	public void setOvercraft(int overcraft) {
		this.overcraft = overcraft;
	}
	
	@Override
	public String toString() {
		return  "Compte Courant: "+ super.toString() + "Autorisation de découvert: " + overcraft  ;
	}

	
	
}