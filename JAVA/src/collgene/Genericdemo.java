package collgene;

class Container <T>
{
	T value;
	
	public void show()
	{
		System.out.println(value.getClass().getName());
	}
}

public class Genericdemo {
	
	public static void main(String args[])
	{
		Container <Double> c = new Container<>();
		c.value=10.0;
		c.show();
		
	}
}
