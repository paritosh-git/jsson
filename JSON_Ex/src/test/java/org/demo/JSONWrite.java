package org.demo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class JSONWrite {
	
	@org.junit.Test
	public  void test() throws FileNotFoundException  
    { 
        // creating JSONObject 
        JSONObject jo = new JSONObject(); 
          
        // putting data to JSONObject 
        jo.put("firstName", "JavaByKiran"); 
        jo.put("lastName", "JBK"); 
        jo.put("age", 25); 
          
        // for address data, first create LinkedHashMap 
        Map m = new LinkedHashMap(4); 
        m.put("streetAddress", "Karve Nagar"); 
        m.put("city", "Pune"); 
        m.put("state", "Maharashtra"); 
        m.put("postalCode", 411057); 
          
        // putting address to JSONObject 
        jo.put("address", m); 
          
        // for phone numbers, first create JSONArray  
        JSONArray ja = new JSONArray(); 
          
        m = new LinkedHashMap(2); 
        m.put("type", "home"); 
        m.put("number", "123456"); 
          
        // adding map to list 
        ja.put(m); 
          
        m = new LinkedHashMap(2); 
        m.put("type", "fax"); 
        m.put("number", "1234587"); 
          
        // adding map to list 
        ja.put(m); 
          
        // putting phoneNumbers to JSONObject 
        jo.put("phoneNumbers", ja); 
          
        // writing JSON to file:"JSONExample.json" in cwd 
        PrintWriter pw = new PrintWriter("JSONExample.json"); 
        pw.write(jo.toString()); 
          
        pw.flush(); 
        pw.close(); 
    } 
}
