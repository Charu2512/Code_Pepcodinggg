/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
Output

c
b
bc
a
ac
ab
abc
*/
import java.io.*;
import java.util.*;

public class Main
{   public static ArrayList<String> getss(String str)
{
    if(str.length()==0)
    {
        ArrayList<String> res1=new ArrayList<>();
        String b="";
        res1.add(b);
        return res1;
    }
    
    
    char ch=str.charAt(0);
    String subs=str.substring(1);
    ArrayList<String> recres=getss(subs);
    ArrayList<String> res=new ArrayList<>();
    for(String a:recres)
    {
        res.add(a);
    }
    for(String a:recres)
    {
        res.add(ch+a);
    }
    return res;
    
}
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		String c="abc";
		ArrayList<String> res=getss(c);
		for(String d: res)
		{
		    System.out.println(d);
		}
	}
}
