
public class TestMohamed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		création puis affichage de 2 comptes bancaires
//		Current Account  [accountId=100200300, creationDate=2023-02-16, balance=1500.0, 
//		    Customer [customerId=1, name=dupont, firstName=robert, email=robert.dupont@xmail.com],
//		         overdraft=200]
//		Saving Account  [accountId=200300400, creationDate=2023-02-16, balance=2000.0, 
//		    Customer [customerId=2, name=jolie, firstName=julie, email=julie.jolie@xmail.com],
//		          rate=5.5]
//		----------------------------------------------------------
//		solde de dupont : 1550.0
//		solde de jolie : 2800.0
//		----------------------------------------------------------
//		Vous demandez un compte inexistant !
//		vous avez dépassé vos capacités de retrait !
//		vous ne pouvez retirer et verser sur le même compte !
//
//
//
//		 
//
//		-----------------------Liste des comptes de ma banque-----------------------------------
//		Saving Account  [accountId=200300400, creationDate=2023-02-16, balance=2800.0, 
//		    Customer [customerId=2, name=jolie, firstName=julie, email=julie.jolie@xmail.com],
//		          rate=5.5]
//		Current Account  [accountId=300400500, creationDate=2023-02-16, balance=750.0, 
//		    Customer [customerId=2, name=jolie, firstName=julie, email=julie.jolie@xmail.com],
//		         overdraft=150]
//		Current Account  [accountId=100200300, creationDate=2023-02-16, balance=1550.0, 
//		    Customer [customerId=1, name=dupont, firstName=robert, email=robert.dupont@xmail.com],
//		         overdraft=200]
//
//		 
//
//		-----------------------Liste des comptes de julie-----------------------------------
//		Saving Account  [accountId=200300400, creationDate=2023-02-16, balance=2800.0, 
//		    Customer [customerId=2, name=jolie, firstName=julie, email=julie.jolie@xmail.com],
//		          rate=5.5]
//		Current Account  [accountId=300400500, creationDate=2023-02-16, balance=750.0, 
//		    Customer [customerId=2, name=jolie, firstName=julie, email=julie.jolie@xmail.com],
//		         overdraft=150]
//
//		 
//
//		-------------------liste des transactions de l'unique compte de robert------------------------
//		Versement : Transaction [transactionId=1, transactionDate=2023-02-16, amount=500.0, accountId=100200300]
//		Retrait : Transaction [transactionId=3, transactionDate=2023-02-16, amount=250.0, accountId=100200300]
//		Retrait : Transaction [transactionId=5, transactionDate=2023-02-16, amount=200.0, accountId=100200300]
//		-------------------liste des transactions du compte N° 200300400 de Julie------------------------
//		Versement : Transaction [transactionId=2, transactionDate=2023-02-16, amount=1000.0, accountId=200300400]
//		Retrait : Transaction [transactionId=4, transactionDate=2023-02-16, amount=400.0, accountId=200300400]
//		Versement : Transaction [transactionId=6, transactionDate=2023-02-16, amount=200.0, accountId=200300400]
//	
		}

}



//bank.createAccount(123, accountList, new CheckingAccount(500, 123, 0));
//bank.displayAll();
//String response = "";
//System.out.println("Veuillez saisir l'Identifiant du client souhaitant ouvrir un nouveau compte:");
//int userID = scanner.nextInt();
//while(response.equals("oui")) {
//	System.out.println("Quel type de compte souhaitez vous choisir ? [1] Compte Courant [2] Livret Epargne ");
//	int accountTypeResponse = scanner.nextInt();
//	System.out.println("Quel est le montat du dépot initial?");
//	int sold = scanner.nextInt();
//	if (accountTypeResponse ==1) {
//		System.out.println("Saisissez le montant du découvert");
//		int overcraft = scanner.nextInt();
//		bank.createAccountIfUserExist(userID, accountList, new CheckingAccount(sold, userID, overcraft) );
//	}else {
//		System.out.println("Saisissez le taux d'interet du livret");
//		double interestRate = scanner.nextDouble();
//		bank.createAccountIfUserExist(userID, accountList, new SavingAccount(sold, userID, interestRate) );
//	}
//	bank.display(userID);
//	System.out.println("Voulez vous ajouter un autre compte au client" + userID + "? Oui ou Non");
//	response = scanner.next().toLowerCase();
//}	
//bank.displayAll();
//
//bank.createUser(12, new User("christian", "pazmany", 123, "toto@.com", "28 rue de la mouche", "0612920920"));
//bank.createUser(13, new User("christian", "pazmany", 123, "toto@.com", "28 rue de la mouche", "0612920920"));
//bank.displayAllUsers();

