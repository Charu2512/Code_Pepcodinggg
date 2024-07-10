/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*Hashmap functions
Output
a->4
*/
import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		char[] arr=new char[10];
	    arr[0]='a';
	    arr[1]='b';
	    arr[2]='b';
	    arr[3]='c';
	    arr[4]='c';
	    arr[5]='a';
	    arr[6]='a';
	    arr[7]='a';
	    arr[8]='x';
	    arr[9]='z';
	    
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
		    if(hm.containsKey(arr[i]))
		    {
		        int of=hm.get(arr[i]);
		        int nf=of+1;
		        hm.put(arr[i],nf);
		    }
		    else{
		        hm.put(arr[i],1);
		    }
		}
		
		int max_freq=0;
		char max_freq_char=arr[0];
		
		Set<Character> s=hm.keySet();
		for(char ch: s)
		{
		    if(hm.get(ch)>max_freq)
		    {
		        max_freq=hm.get(ch);
		        max_freq_char=ch;
		    }
		}
		
		System.out.println(max_freq_char+"->"+max_freq);
		
		
	}
}
