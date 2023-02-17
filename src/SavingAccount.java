public  class SavingAccount extends Account{
	
	private double interestRate;

	public SavingAccount(int sold, int ownerUserId, User user, double interestRate) {
		super(sold, ownerUserId, user);
		this.interestRate= interestRate;
	}
	public SavingAccount(int sold, int ownerUserId, double interestRate) {
		super(sold, ownerUserId);
		this.interestRate= interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	@Override
	public String toString() {
		return " Compte Epargne " +super.toString() + "Taux d'interet du livret: " + interestRate  ;
	}

	
}