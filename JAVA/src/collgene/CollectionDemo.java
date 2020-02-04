package collgene;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo 
{
	public static void main(String args[])
	{
		//Collection <Integer> values = new ArrayList<Integer>();
		List <Integer> values = new ArrayList<Integer>();
		values.add(3);
		values.add(4);
		//values.add(52.89);
		values.add(3); 
	
		values.add(2);
		values.add(1);
		values.remove(new Integer(4));
		//values.add("krishna");
		 
		Collections.sort(values);
//		Iterator i = values.iterator();
//		
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
		
		for(Object i:values)
		{
			System.out.println(i);
		}
		}
	}

