public class testAccount {
	public static void main(String[] args) {
	Account account = new Account(500, 32000);
	Account account2 = new Account(500, 32000);
	System.out.println(account);
	System.out.println(account2);
	
	Account two = new CheckingAccount(500, 12256, 200);
	System.out.println(two);
	Account three = new SavingAccount(500, 12256, 2.5);
	System.out.println(three);
	}

}
