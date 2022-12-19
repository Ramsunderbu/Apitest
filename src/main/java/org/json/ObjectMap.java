package org.json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMap {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		File f = new File("C:\\Users\\Sabari\\eclipse-workspace\\ApiTesting\\Sample.json");
		ObjectMapper map =new ObjectMapper();
		Root r = map.readValue(f, Root.class);
		System.out.println(r.getName());
		System.out.println(r.getMarriedstatus());
		
		Address a = r.getAddress();
		System.out.println(a.getStreet());
		System.out.println(a.getDistrict());
		System.out.println(a.getClass());
		
	}

}
