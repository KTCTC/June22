package hash.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapClass2 {

	public static void main(String[] args) {
		
		
	  HashMap<String, String> uData = getUserDetails();
	  
	  boolean flag = uData.get("FirstName").equals("Amit");
	  System.out.println(flag);

     HashMap<String, String> data = new HashMap<>();
     
     data.put("FirstName", "Amit");
     data.put("LastName", "Patil");
     data.put("Age", "25");
     data.put("Email", "amit@patil.com");
     data.put("Salary", "40000");
     data.put("Department", "IT");
     
    String ss = data.get("FirstName");
    System.out.println(ss);
    System.out.println(data.get("Salary"));
    System.out.println(data.size());
    
    for (Entry<String, String> each: data.entrySet())
    {
    	System.out.println(each.getKey());
    	System.out.println(each.getValue());
    }
  

	}
	
	
	public static HashMap<String,String> getUserDetails()
	{
		 HashMap<String, String> data = new HashMap<>();
	     
	     data.put("FirstName", "Amit");
	     data.put("LastName", "Patil");
	     data.put("Age", "25");
	     data.put("Email", "amit@patil.com");
	     data.put("Salary", "40000");
	     data.put("Department", "IT");
	     
	     return data;
	}

}
