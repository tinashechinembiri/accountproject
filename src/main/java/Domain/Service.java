package Domain;
import java.io.IOException;
import java.util.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Service {

	public static void main (String [] arg) throws JsonProcessingException
	{
		BankApplication m1 = new BankApplication ("jo", "mario", "1"); 
	
		Map<Integer, BankApplication> name = new HashMap<Integer, BankApplication>(); 
		
		name.put(1, new BankApplication(m1.getFirstName(), m1.getLastName(), m1.getAccountName())); 
		
		System.out.println( name.values() );
		
		ObjectMapper mapper = new ObjectMapper();
		
		
		String make_Json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(name);
		System.out.println(make_Json);
		
		
			try {
				TypeReference <HashMap<String,BankApplication>> change_string = 
						new TypeReference<HashMap<String,BankApplication>>() {};
						
						
				Map<String,BankApplication> map = mapper.readValue(make_Json, change_string);
				
				
				System.out.println(map.toString());
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		
		
		
		
	}
	
}
