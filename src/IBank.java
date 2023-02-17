
public interface IBank {
	
	public void createAccountForNewUser(Account account);
	public void createUser(int key, User newUser);
		
	public void deposit(Account account, int amount);  // depot
	public boolean withdraw(Account account,int amount); // retrait
	public void transfer(Account accountDebit,Account accountCredit, int amount); // virement
	public void seeBalance(Account account); //Affichage du compte
	
	public void seeListAccount(Account account);
}
