package org.json;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sample {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader f = new FileReader("C:\\Users\\Sabari\\eclipse-workspace\\ApiTesting\\Sample.json");
		
		JSONParser json = new JSONParser();
		
		Object obj = json.parse(f);
		
		System.out.println(obj);
		
		JSONObject jo = (JSONObject) obj;
		
		Object name = jo.get("name");
		System.out.println(name);
		
		Object ms = jo.get("marriedstatus");
		System.out.println(ms);
		
		Object age = jo.get("age");
		System.out.println(age);
	}

}
