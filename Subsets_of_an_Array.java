/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
Output
_ _ _ 
_ _ 3 
_ 2 _ 
_ 2 3 
1 _ _ 
1 _ 3 
1 2 _ 
1 2 3
*/

public class Main
{
	public static void main(String[] args) {
	
	int n=3;
	int[] arr=new int[n];
	for(int i=0;i<arr.length;i++)
	{
	  arr[i]=i+1;
	  
	}
	
	int len=(int)Math.pow(2,n);
	for(int i=0;i<len;i++)
	{
	    int temp=i;
	    String str="";
	    for(int j=n-1;j>=0;j--)
	    {
	        int r=temp%2;
	        temp=temp/2;
	        if(r==0)
	        {
	            str="_ "+str;        }
	         
	    else{
	        str=arr[j]+" "+str;
	    }
	    
	    
	}
	System.out.println(str);
	
	
	}
}
    
}
