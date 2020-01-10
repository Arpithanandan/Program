package pattern;

/*import java.util.HashMap;
import java.util.Map.Entry;

public class Stringcount {

	public static void main(String[] args) {

		String s = "Born on Monday Named on Tuesday Married on wednesday Sick on thursday worse on Friday Died on Saturday Burried on Sunday";
		
		String[] arrOfStr = s.split(" "); 
		
        HashMap<String, Integer> words = new HashMap<>();
        
        for(String a :arrOfStr)
        {
        	words.put(a,1);
        }

	     // using for-each loop for iteration over Map.entrySet() 
	        for (Entry<String, Integer> entry : words.entrySet())  
	            System.out.println("Key = " + entry.getKey() + 
	                             ", Value = " + entry.getValue()); 
	    } 
        
        		
	}*/

import java.util.*;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Set;

public class Stringcount {
	
 static String s="Born On Monday "
		      +  "Named On Tuesday "
		      +  "Married On Wednesday "     
		      +  "Sick On Thursday "
		      +  "Worse On Friday " 
		      +  "Died On Saturday "
		      +  "Burried On Sunday ";

public static HashMap<String,Integer> wordCount(String input[])
{
	HashMap<String,Integer> map = new HashMap<String,Integer>();
	
	for(int i=0;i<input.length;i++)
	{
	
		if(map.containsKey(input[i]))
		{
			map.put(input[i],map.get(input[i])+1);	
		}
		else
		{
			map.put(input[i],1);	
		}
			
	}
	
	
	return map;
}

public static void main(String args[])
{
	
	String a[] = s.split(" ");
	
	HashMap<String,Integer> wordscount =  Stringcount.wordCount(a);
	
	Set set = wordscount.entrySet();
	
	Iterator itr = set.iterator();
	
	while(itr.hasNext())
	{
		Map.Entry etr = (Map.Entry) itr.next();
		
		System.out.println(etr.getKey() +" : " + etr.getValue());
	}
		
}
}



