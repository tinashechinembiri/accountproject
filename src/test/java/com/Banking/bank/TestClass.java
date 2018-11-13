package com.Banking.bank;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import Domain.BankApplication;
import Domain.Service;



public class TestClass {
	Service thisservice = new Service(); 
	@Before 
	public void initialize()
	{
	
		
		
	}
	
	@Test
	public void test() {
		
		BankApplication m1 = new BankApplication ("jo", "mario", "1"); 
		BankApplication m2 = new BankApplication ("jo", "mario", "1"); 
		BankApplication m3 = new BankApplication ("jo", "mario", "1");
		BankApplication m4 = new BankApplication ("jamal", "fred", "1"); 
		
		
		assertEquals(1, thisservice.get_person("jo")); 			
	}

}
