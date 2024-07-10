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
4
5
6
7
8
9
*/
import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int[] arr1=new int[9];
	    arr1[0]=2;
	    arr1[1]=3;
	    arr1[2]=1;
	    arr1[3]=4;
	    arr1[4]=6;
	    arr1[5]=7;
	    arr1[6]=5;
	    arr1[7]=8;
	    arr1[8]=9;
	   
	    
	   int k=2;
	    
	    
	   PriorityQueue<Integer> pq_asc=new PriorityQueue<>();  // to print in asc
	   for(int i=0;i<k;i++)
	   {
	       pq_asc.add(arr1[i]);
	   }
	   
	   for(int i=k;i<arr1.length;i++)
	   {
	      pq_asc.add(arr1[i]);
	      System.out.println(pq_asc.peek());
	      pq_asc.remove();
	   }
	   
	   while(pq_asc.size()>0)
	   {
	       System.out.println(pq_asc.peek());
	       pq_asc.remove();
	       
	   }
	}}
