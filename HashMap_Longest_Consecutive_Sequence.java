/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*Hashmap functions
Output
8
9
10
11
12
*/
import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int[] arr1=new int[11];
	    arr1[0]=10;
	    arr1[1]=5;
	    arr1[2]=9;
	    arr1[3]=1;
	    arr1[4]=11;
	    arr1[5]=8;
	    arr1[6]=6;
	    arr1[7]=15;
	    arr1[8]=3;
	    arr1[9]=12;
	    arr1[10]=2;
	    
	   
	    
	    
	    HashMap<Integer,Boolean> hm=new HashMap<>();
	    for(int i=0;i<arr1.length;i++)
	    {
	        
	            hm.put(arr1[i],true);
	        
	    }
	    
	    for(int i=0;i<arr1.length;i++)
	    {
	       int val=arr1[i];
	       if(hm.containsKey(val-1))
	       {
	           hm.put(val,false);
	       }
	    }
	    
	    int max_l=0;
	    int max_l_st=arr1[0];
	    for(int i=0;i<arr1.length;i++)
	    {   int temp=1;
	        if(hm.get(arr1[i])==true)
	        {
	            while(hm.containsKey(arr1[i]+temp))
	            {
	                temp++;
	            }
	        }
	        if(max_l<temp)
	        {
	            max_l=temp;
	            max_l_st=arr1[i];
	        }
	    }
	    
	    for(int i=0;i<max_l;i++)
	    {
	        System.out.println(max_l_st+i);
	    }
	
		
	}
}
