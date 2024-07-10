/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*Hashmap functions
get()
put()
containsKey()
keySet()
*/
import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("India",1);
		hm.put("Nigeria",2);
		System.out.println(hm);
		System.out.println(hm.get("India"));
		System.out.println(hm.get("Australia"));
		hm.put("India",3);
		System.out.println(hm);
		System.out.println(hm.containsKey("India"));
		System.out.println(hm.containsKey("Australia"));
		
		Set<String> s=hm.keySet();
		for(String a:s)
		{
		    System.out.println(a);
		}
		
	}
}
