import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IBankImpl implements IBank {

	private Map<Integer, ArrayList<Account>> accounts;
	private Map<Integer, User> users;
	private Map<Integer, ArrayList<Operation>> operations;
	
	public IBankImpl() {
		accounts = new HashMap<>();
		users = new HashMap<>();
		operations = new HashMap<>();
	}

	@Override
	public void createAccountForNewUser(Account account) {
		User user = account.getUser(); 
		if (accounts.containsKey(user.getUserId())) {
			System.out.println("je suis dans le if");
			accounts.get(user.getUserId()).add(account);
			if (!users.containsKey(user.getUserId())) {
				users.put(user.getUserId(), user);																				
			} 
		} else {
			System.out.println("je suis dans le else");
			accounts.put(user.getUserId(), new ArrayList<Account>());
			accounts.get(user.getUserId()).add(account);
			if (!users.containsKey(user.getUserId())) {
				users.put(user.getUserId(), user);																				
			}
		}	
	}

	public void displayAllAccounts() {
		System.out.println("Liste des comptes présent dans notre banque");
		System.out.println("-------------------------------");
		for (Map.Entry mapentry : accounts.entrySet()) {

			System.out.println("Numéro Client: " + mapentry.getKey() + " | Compte(s): " + mapentry.getValue());
		}
	}
	public void displayAllUsers() {
		System.out.println("Liste des clients présent dans notre banque");
		System.out.println("-------------------------------");
		for (Map.Entry mapentry : users.entrySet()) {
			System.out.println("Numéro Client: "+mapentry.getKey()+ " | Informations: " + mapentry.getValue());
			System.out.println();

		}
	}
	@Override
	public void createUser(int key, User newUser) {
		users.put(key, newUser);
	}
	
	@Override
	public void seeBalance(Account account) {
		if(accounts.containsKey(account.getOwnerUserId())){
			User user = account.getUser(); 
			System.out.println("Le solde du compte " + account.getAccountNumber() +" appartenant à "+ user.getLastName() +" "+ user.getFirstName()+ " est de :" + account.getSold()+"€");
		} else {
			System.out.println("Le compte demandé n'existe pas!");
		}
	}
	@Override
	public void seeListAccount(Account account) {
		if(accounts.containsKey(account.getOwnerUserId())){
			User user = account.getUser(); 
			System.out.println("Voici la liste des comptes de "+ user.getLastName() +" "+ user.getFirstName());
			for (Map.Entry mapentry : accounts.entrySet()) {
				if(mapentry.getKey().equals(account.getOwnerUserId())) {
					System.out.println("Numéro Client: " + mapentry.getKey() + " | Compte(s): " + mapentry.getValue());
				}
			}
		} else {
			System.out.println("Le compte demandé n'existe pas!");
		}
		
	}
	public void seeListOperations(Account account) {
		if(accounts.containsKey(account.getOwnerUserId())){
			User user = account.getUser(); 
			System.out.println("Voici la liste des opérations de "+ user.getLastName() +" "+ user.getFirstName());
			for (Map.Entry mapentry : operations.entrySet()) {
				if(mapentry.getKey().equals(account.getOwnerUserId())) {
					System.out.println(mapentry);
				}
			}
		} else {
			System.out.println("Le compte demandé n'existe pas!");
		}
		
	}
	@Override
	public void deposit(Account account,int amount) {
		if(accounts.containsKey(account.getOwnerUserId())){
			account.setSold(account.getSold() + amount);
			Operation ope = new Operation(account.getOwnerUserId(), account.getAccountNumber(), amount, '+');
			if (operations.containsKey(account.getOwnerUserId())) {
				operations.get(account.getOwnerUserId()).add(ope);
			} else {
				operations.put(account.getOwnerUserId(),new ArrayList<Operation>());
				operations.get(account.getOwnerUserId()).add(ope);
			}
		}
	}
	
	@Override
	public boolean withdraw(Account account,int amount) {
		if(accounts.containsKey(account.getOwnerUserId())){
			if(account.getSold() > amount) {
				account.setSold(account.getSold() - amount);
				Operation ope = new Operation(account.getOwnerUserId(), account.getAccountNumber(), amount, '-');
				if (operations.containsKey(account.getOwnerUserId())) {
					operations.get(account.getOwnerUserId()).add(ope);
				} else {
					operations.put(account.getOwnerUserId(),new ArrayList<Operation>());
					operations.get(account.getOwnerUserId()).add(ope);
				}
			} else {
				System.out.println("Retrait impossible, vous n'avez pas les fonds.");
				return false;
			}
			
		} else {
			System.out.println("Le compte n'existe pas.");
			return false;
		}
		return true;
	}

	@Override
	public void transfer(Account accountDebit, Account accountCredit, int amount) {
		if(accounts.containsKey(accountDebit.getOwnerUserId()) && accounts.containsKey(accountCredit.getOwnerUserId())){
			if(accountDebit.getAccountNumber()== accountCredit.getAccountNumber()) {
				System.out.println("Bien essayer petit malin!");
			} else  {
				if(withdraw(accountDebit, amount)) {
					deposit(accountCredit, amount);
				} else {
					System.out.println("Virement impossible!");
				}
			}
		} else {
			System.out.println("Impossible d'effectuer le virement. Le compte n'existe pas.");
		}
	}

	public void displayAllOperations() {
		System.out.println("Liste des operations présent dans notre banque");
		System.out.println("-------------------------------");
		for (Map.Entry mapentry : operations.entrySet()) {
			System.out.println(mapentry);
			System.out.println();

		}
	}


}
