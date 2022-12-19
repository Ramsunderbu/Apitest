package org.json;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Arry {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		File f = new File("C:\\Users\\Sabari\\eclipse-workspace\\ApiTesting\\Sample.json");
		ObjectMapper map =new ObjectMapper();
		Root r = map.readValue(f, Root.class);
		ArrayList<Long> phone = r.getPhone();
	    System.out.println(phone.size());
		for (Object x : phone) {
			System.out.println(x);
		}
		
	}

}
