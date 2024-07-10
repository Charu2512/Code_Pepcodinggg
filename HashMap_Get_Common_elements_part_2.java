/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*Hashmap functions
Output
1
1
2
2
5
8
*/
import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int[] arr1=new int[10];
	    arr1[0]=1;
	    arr1[1]=1;
	    arr1[2]=2;
	    arr1[3]=2;
	    arr1[4]=2;
	    arr1[5]=3;
	    arr1[6]=5;
	    arr1[7]=7;
	    arr1[8]=7;
	    arr1[9]=8;
	    
	    int[] arr2=new int[10];
	    arr2[0]=1;
	    arr2[1]=1;
	    arr2[2]=1;
	    arr2[3]=2;
	    arr2[4]=2;
	    arr2[5]=4;
	    arr2[6]=5;
	    arr2[7]=5;
	    arr2[8]=5;
	    arr2[9]=8;
	    
	    
	    HashMap<Integer,Integer> hm=new HashMap<>();
	    for(int i=0;i<arr1.length;i++)
	    {
	        if(hm.containsKey(arr1[i]))
	        {
	            int of=hm.get(arr1[i]);
	            int nf=of+1;
	            hm.put(arr1[i],nf);
	        }
	        else{
	            hm.put(arr1[i],1);
	        }
	    }
	    System.out.println(hm);
	    for(int i=0;i<arr2.length;i++)
	    {
	        if( hm.containsKey(arr2[i]) && hm.get(arr2[i])>0)
	        {
	            System.out.println(arr2[i]);
	            int of=hm.get(arr2[i]);
	            int nf=of-1;
	            hm.put(arr2[i],nf);
	        }
	    }
	
		
	}
}
