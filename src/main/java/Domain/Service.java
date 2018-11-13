package Domain;
import java.util.*;

public class Service {

	public static void main (String [] arg)
	{
		BankApplication m1 = new BankApplication ("jo", "mario", "1"); 
	
		Map<Integer, BankApplication> name = new HashMap<Integer, BankApplication>(); 
		
		name.put(1, new BankApplication(m1.getFirstName(), m1.getFirstName(), m1.getAccountName())); 
		
		System.out.println( name.values() );
		
		
		
	}
	
}
