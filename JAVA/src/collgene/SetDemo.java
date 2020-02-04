package collgene;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo 
{
	public static void main(String args[])
	{
		//Set <Integer> values = new HashSet<>();
		Set <Integer> values = new TreeSet<>();
		
		System.out.println(values.add(30));
		System.out.println(values.add(24));
		System.out.println(values.add(02));
		System.out.println(values.add(10));
		System.out.println(values.add(10));
		
		values.add(30);
		values.add(24);
		values.add(02);
		values.add(10);
		values.add(10);
		
		for(Integer i:values)
		{
			System.out.println(i);
		}
	}
	
}
