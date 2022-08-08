package Collections1;

import java.util.HashSet;
import java.util.Set;

public class HashSet1 {

	static Set<String> S1= new HashSet<String>();
	
	
	public static void main(String[] args) 
	{
		
		S1.add("Welcome");
		S1.add("Hello");
		S1.add("Advith");
		S1.add("Welcome");
		
		System.out.println(S1);
		System.out.println("---------------------------------------");
		
		
		Set<Integer> S2= new HashSet<Integer>();
		
		S2.add(10);
		S2.add(50);
		S2.add(25);
		S2.add(10);
		S2.add(100);
		S2.add(99);
		S2.add(null);
		
		System.out.println(S2);
		
		
	}

}
