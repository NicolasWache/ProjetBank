public class Admin extends User{
	protected boolean isAdmin;

	public Admin(int userId, String firstName, String lastName,int dateOfBirth, String email, String address, String phone,Account account, boolean isAdmin) {
		super(userId, firstName, lastName,dateOfBirth, email, address, phone, account);
		this.isAdmin = isAdmin;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	@Override
	public String toString() {
		return super.toString() + "Admin [isAdmin=" + isAdmin + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}