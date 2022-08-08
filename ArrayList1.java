package Collections1;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
	
	static List <String> l1=new ArrayList <String>();

	public static void main(String[] args)
	
	{
		l1.add("Hello");
		l1.add("Aruna");
		l1.add("How");
		l1.add("Are");
		l1.add("You");
		l1.add("How");
		l1.add("Are");
		l1.add("Aruna");
		
		System.out.println(l1);
		System.out.println("----------------");
		
		
		List <Integer> l2=new ArrayList <Integer>();
		
		l2.add(1);
		l2.add(5);
		l2.add(10);
		l2.add(1000);
		l2.add(99);
		l2.add(55);
		l2.add(65);
		l2.add(1000);
		l2.add(55);
		
		
		System.out.println(l2);//[1,5,10,1000,99,55,65,1000,55]
		

	}

}
