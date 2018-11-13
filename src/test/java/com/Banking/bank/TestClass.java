package com.Banking.bank;

import static org.junit.Assert.*;



import org.junit.Before;
import org.junit.Test;

import Domain.BankApplication;
import Domain.Service;



public class TestClass {
	
	@Before 
	public void initialize()
	{
	
		
		
	}
	
	@Test
	public void test() {
		Service thisservice = new Service(); 
		
		BankApplication m1 = new BankApplication ("jo", "mario", "1");
		
	
	
		BankApplication m2 = new BankApplication ("jo", "mario", "1"); 
		BankApplication m3 = new BankApplication ("jo", "mario", "1");
		BankApplication m4 = new BankApplication ("jamal", "fred", "1"); 
		thisservice.add_member(m1);
		thisservice.add_member(m2);
		thisservice.add_member(m3);
		thisservice.add_member(m4);
		
		
		assertEquals(3, thisservice.get_person("jo"));
		assertEquals(1, thisservice.get_person("jamal"));
	}

}
