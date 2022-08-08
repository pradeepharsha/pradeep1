package Collections1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {
	
	static Map <Integer,String> mp = new LinkedHashMap <Integer,String>();

	public static void main(String[] args) 
	{
		mp.put(10,"Ravi");
		mp.put(56,"Kiran");
		mp.put(30,"Raju");
		mp.put(10,"Kishan");
		mp.put(30,null);
		mp.put(null, null);

		
		System.out.println(mp);//10=Kishan,56=kiran, 30=null, null=null
	}

}
