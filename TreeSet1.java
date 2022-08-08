package Collections1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {

	static Set<String> S1= new TreeSet<String>();
	
	
	public static void main(String[] args) 
	{
		
		S1.add("welcome");
		S1.add("Hello");
		S1.add("advith");
		S1.add("aditya");
		
		System.out.println(S1);
		System.out.println("---------------------------------------");
		
		
		Set<Integer> S2= new TreeSet<Integer>();
		
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
