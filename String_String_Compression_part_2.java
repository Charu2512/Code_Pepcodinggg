/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
Output
fa4b4c3d3e2
*/
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
	String str="faaaabbbbcccdddee";
	StringBuilder sb=new StringBuilder(str);
	String res="";
	res=res+str.charAt(0);
	int count=1;
	int len=str.length();
	for(int i=1;i<len;i++)
	{
	    char curr=str.charAt(i);
	    char prev=str.charAt(i-1);
	    if(curr!=prev)
	    {    
	        if(count>1)
	        res+=count;
	        res+=curr;
	        count=1;
	        
	    }
	    else{
	        count++;
	    }
	}
	if(count>1)
	res+=count;
	System.out.print(res);
	
	}
}
