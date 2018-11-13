package Domain;

import java.io.IOException;
import java.util.*;
import java.util.stream.Stream;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Service {
	Map<Integer, BankApplication> name = new HashMap<Integer, BankApplication>();
	BankApplication m1 = new BankApplication("jo", "mario", "1");
	
int count =  0; 	
	
	public static void main(String[] arg) throws JsonProcessingException {
		Service m1 = new Service();
		m1.Details();
	}

	public void Details() throws JsonProcessingException {

		

		name.put(1, new BankApplication(m1.getFirstName(), m1.getLastName(), m1.getAccountName()));

		System.out.println(name.keySet() + "" + name.values());

		ObjectMapper mapper = new ObjectMapper();

		String make_Json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(name);
		System.out.println(make_Json);

		try {
			TypeReference<HashMap<String, BankApplication>> change_string = new TypeReference<HashMap<String, BankApplication>>() {
			};

			Map<String, BankApplication> map = mapper.readValue(make_Json, change_string);

			System.out.println(map.toString());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

public void add_member (BankApplication name1 )
{
	this.name.put(count, name1); 
	
	count++; 
}
public int get_person (String name1)
{
	 int counter = 0;
	 
	
	for (BankApplication check : name.values()  )
	{
		if (check.getFirstName().equals(name1))
		{
			counter ++; 
		}
	}
	
	return counter ; 
	
}
public int stream_person(String name1 )
{
	
	return (int) name.values().stream().filter(m1 -> m1.getFirstName().equals(name1)).count(); 
		
}

}
