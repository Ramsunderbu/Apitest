package org.json;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ArraysnbNob {
	public static void main(String[] args) throws IOException, ParseException {
		
		FileReader f = new FileReader("C:\\Users\\Sabari\\eclipse-workspace\\ApiTesting\\Sample.json");
		JSONParser json = new JSONParser();
		Object obj = json.parse(f);
		
		JSONObject j=(JSONObject)obj;
//		Object address = j.get("address");
		Object phone = j.get("phone");
		System.out.println(phone);
		
//		JSONObject jaddress=(JSONObject)address;
		
//		Object street = jaddress.get("street");
//		System.out.println(street);
//		
//		Object dis = jaddress.get("district");
//		System.out.println(dis);
		JSONArray jphone =(JSONArray)phone;
		System.out.println(jphone.size());
		
		for (int i = 0; i < jphone.size(); i++) {
			System.out.println(jphone.get(i));
			
		}
//		"address": {
//			"street": "Bala Murugan Garden ",
//			"district": "chennai"
//		},
//		"phone":[
//		9600723020,
//		7845047820,
//		9842442327,
//		9566671744,
//		9788572777
//		        ]
		
		
	}

}
