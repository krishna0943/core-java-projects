package collgene;

import java.util.*;


public class MapDemo {
	
	public static void main(String args[])
	{
		
		Map m = new HashMap();
		m.put(1,"krishna");
		m.put(2,"Riddhi");
		m.put(3,"vruti");
		
		Set<Integer> keys= m.keySet();
		
		for(Integer key:keys)
		{
			System.out.println(key + " " + m.get(key));
		}
		
		System.out.println(m);
		
		System.out.println(m.get(1));
		
	}

}
