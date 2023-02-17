
public class Main {
	public static void main(String[] args) {
		IBankImpl bank = new IBankImpl();
		
		Account numberOne = new CheckingAccount(2900, 14441,new User(14441,"Nicolas", "Wache", 28121989, "nico@gmail.com", "12224 dzjdc", "0666555523"),200);
		Account numberTwo = new SavingAccount(80000, 14441,new User(14441,"Nicolas", "Wache", 28121989, "nico@gmail.com", "12224 dzjdc", "0666555523"),5);
		Account numberThree = new CheckingAccount(1010000, 14420,new User(14420,"Christian", "Pazmani", 17021996, "chris@gmail.com", "1 allee mirabelle", "0785522232"),5);
		
		
		bank.createAccountForNewUser(numberOne);
		bank.createAccountForNewUser(numberTwo);
		bank.createAccountForNewUser(numberThree);
		bank.displayAllUsers();
		bank.displayAllAccounts();
		bank.seeBalance(numberOne);
		bank.seeBalance(numberTwo);
		bank.seeBalance(numberThree);
		bank.seeBalance(new CheckingAccount(0,0001,0));
		System.out.println("-------------------");
		bank.deposit(numberOne, 500);
		bank.seeBalance(numberOne);
		bank.withdraw(numberOne, 5000);
		bank.seeBalance(numberOne);
		bank.withdraw(numberOne, 500);
		bank.seeBalance(numberOne);
		System.out.println("-------------------");
		bank.transfer(numberThree, numberOne, 10000);
		bank.seeBalance(numberOne);
		bank.seeBalance(numberThree);
		bank.transfer(numberOne, numberOne, 10000);
		bank.transfer(numberOne, numberThree, 100000);
		bank.transfer(numberThree, new CheckingAccount(0,0001,0), 10000);
		bank.seeListAccount(numberOne);
		bank.seeListAccount(new CheckingAccount(0,0001,0));
		bank.displayAllOperations();
		bank.seeListOperations(numberOne);
		bank.seeListOperations(new CheckingAccount(0,0001,0));
	}

}
