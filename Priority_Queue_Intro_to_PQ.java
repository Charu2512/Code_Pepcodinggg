/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*Hashmap functions
Output
1
2
3
5
6
8
9
10
11
12
15

15
12
11
10
9
8
6
5
3
2
1
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
	    
	   
	    
	    
	   PriorityQueue<Integer> pq_asc=new PriorityQueue<>();  // to print in asc
	   for(int i=0;i<arr1.length;i++)
	   {
	       pq_asc.add(arr1[i]);
	   }
		while(pq_asc.size()>0)
		{
		    System.out.println(pq_asc.peek());
		    pq_asc.remove();
		}
	
	
	System.out.println();
	
	  
	   PriorityQueue<Integer> pq_desc=new PriorityQueue<>(Collections.reverseOrder()); //to print in desc
	   for(int i=0;i<arr1.length;i++)
	   {
	       pq_desc.add(arr1[i]);
	   }
		while(pq_desc.size()>0)
		{
		    System.out.println(pq_desc.peek());
		    pq_desc.remove();
		}
}}
