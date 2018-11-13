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
	public  BankApplication() {
		
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
	
	public String getAccountName() {
		return accountName;
	}
	
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	@Override
	public String toString() {
		return "BankApplication [firstName=" + firstName + ", lastName=" + lastName + ", accountName=" + accountName
				+ "]";
	}
 
	
	
	
	
	

}
