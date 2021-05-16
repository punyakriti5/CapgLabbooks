package capg.lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Ex1hashMapSort {
	 static List<Entry<String, String>> getValues(Map<String, String> map)
	    {   
		 
	    	List<Entry<String, String>> entries = new ArrayList<Map.Entry<String,String>>(map.entrySet());
	        Collections.sort(entries, new Comparator<Map.Entry<String, String>>()
	        		{
	        	      public int compare(Map.Entry<String, String> a,Map.Entry<String, String> b)
	        	      {  
	        	    	  
	        	    	  
	        	    	  return Integer.compare(b.getKey().compareTo(a.getKey()), 0);
	        	      }
	        		});	
	    	return entries;
	    }
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("India", "Delhi");
		map.put("Bangladesh", "Dhaka");
		map.put("Pakistan", "Karachi");
		map.put("France", "Paris");
		map.put("UK", "London");
        List<Entry<String, String>> list = getValues(map);
        
        Iterator<Entry<String, String>> i = list.iterator();
        
        while(i.hasNext())
        {
        	Entry<String, String> values = i.next();
        	System.out.println(values);
        }

	}

}
