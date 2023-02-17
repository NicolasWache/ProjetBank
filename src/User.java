import java.util.concurrent.atomic.AtomicInteger;

public class User {

	/**
	 * Accompli ! Exercice Poo 1.8
	 * 
	 * @param args
	 */

	private int userId;
	protected String firstName;
	protected String lastName;
	protected String email;
	protected String address;
	protected String phone;
	protected int dateOfBirth;
	protected Account account;

	public User(int userId, String firstName, String lastName,int dateOfBirth,  String email, String address, String phone, Account account) {

		this.userId =userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.account = account;

	}
	
	public User(int userId, String firstName, String lastName,int dateOfBirth,  String email, String address, String phone) {

		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.address = address;
		this.phone = phone;

	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Numéro de client: " + userId + ", Prénom: " + firstName + ", Nom: " + lastName +" Date de naissance: " + dateOfBirth + ", Adresse Email: " + email
				+ ", Adresse Postale: " + address + ", Numéro de téléphone: " + phone + "]";
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	

}
