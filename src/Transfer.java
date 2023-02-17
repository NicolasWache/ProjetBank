
public class Transfer extends Operation{
		//attributs
		private int accoundIdTransfer;
		
		//constructeurs
		public Transfer(int userId, int accountId, double amount, char type,int accoundIdTransfer) {
			super(userId,accountId, amount, type);
			setAccoundIdTransfer(accoundIdTransfer);
			idOperation = ID_FACTORY.getAndIncrement();
		}
		
		
		//accesseurs
		public int getAccoundIdTransfer() {
			return accoundIdTransfer;
		}
		public void setAccoundIdTransfer(int accoundIdTransfer) {
			this.accoundIdTransfer = accoundIdTransfer;
		}
		
		//méthodes
		@Override
		public String toString() {
			return "Opération n°"+ idOperation + "\nCompte : " + getAccountId() + "\nVers le compte : "+ getAccoundIdTransfer() +"\nDate : " + date + "\nMontant : -" + getTransactionAmount();
		}
}
