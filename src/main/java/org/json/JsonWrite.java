package org.json;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonWrite {
	
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		File f=new File("C:\\Users\\Sabari\\eclipse-workspace\\ApiTesting\\Sample.json");
		
		ObjectMapper map =new ObjectMapper();
		ArrayList<Long> phone = new ArrayList<Long>();
		phone.add(9788572777l);
		phone.add(9566671744l);
		phone.add(7845047820l);
		
		Address address = new Address("Periya Aranmanai Strret", "Ariyalur");
		
		Root r = new Root("Ram", 29, true, address, phone);
		
		map.writeValue(f, r);
		
		System.out.println("Done");
		
		
	
		
		
	}

}
