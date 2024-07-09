/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
Output
[2, 3, 4, 8, 9, 10, 11]
[4, 8, 9, 10]
*/
import java.io.*;
import java.util.*;
public class Main
{   public static boolean is_prime(int num)
{
    for(int i=2;i*i<=num;i++)
    {
        if(num%i==0)
        return false;
        
    }
    return true;
}
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		System.out.println(list);
		for(int i=list.size()-1;i>=0;i--)  //Traversing from emd because of index changing refer video of pepcoding
		{
		    if(is_prime(list.get(i)))
		    list.remove(i);
		}
		System.out.println(list);
		
	}
}
