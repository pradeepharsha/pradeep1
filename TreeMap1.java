package Collections1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {
	
	static Map <Integer,String> mp = new TreeMap <Integer,String>();

	public static void main(String[] args) 
	{
		/*mp.put(10,"Ravi");
		mp.put(56,"Kiran");

		mp.put(null,"Raju");
		mp.put(10,"Kishan");
		mp.put(30,"Advith");
		mp.put(40, null);

		
		System.out.println(mp);//10=Kishan, 30=Advith, 40=null, 56= Kiran
		
		System.out.println("-------------------------");*/
		
		
		
		Map <String,Integer> mp1 = new HashMap <String, Integer>();
		
		mp1.put("Viswa", 10);
		mp1.put("Viswa", 20);
		mp1.put("Viswa", 30);
		mp1.put("Viswa", 500);
		mp1.put("Aruna",55);
		mp1.put("Aruna",545);
		mp1.put("Aruna",555);
		mp1.put("Aruna",585);
		
		
		System.out.println(mp1);//Ravi=45,Raju=30,Kiran=56,Kishan=30,Advith=30,null=25
		
		
	}
}
