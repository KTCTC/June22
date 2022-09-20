package hash.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapClass {

	public static void main(String[] args) {

     HashMap<Integer, String> data = new HashMap<>();
     
     data.put(1, "Amit");
     data.put(2, "Ajay");
     data.put(33, "CHandu");
     data.put(null, null);
     data.put(4, null);
     data.put(null, "Kapil");
     
    String ss = data.get(2);
    System.out.println(ss);
    System.out.println(data.get(null));
    System.out.println(data.size());
    
    for (Entry<Integer, String> each: data.entrySet())
    {
    	System.out.println(each.getKey());
    	System.out.println(each.getValue());
    }
  

	}

}
