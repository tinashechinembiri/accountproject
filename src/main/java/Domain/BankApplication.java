package Domain;

public class BankApplication {
	private String firstName; 
	private String lastName; 
	private String accountName;
	
	public BankApplication(String first, String last , String account)
	{
		this.firstName = first; 
		this.lastName = last ; 
		this.accountName = account; 
	}
	public BankApplication() {
		
	}
	public String getFirstName() {
		return firstName;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	
	
	public String getAccountName() {
		return accountName;
	}
	
	
	@Override
	public String toString() {
		return "BankApplication [firstName=" + firstName + ", lastName=" + lastName + ", accountName=" + accountName
				+ "]";
	}
 
	
	
	
	
	

}
