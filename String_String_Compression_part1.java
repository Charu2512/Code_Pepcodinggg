/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
Output
fabcde
*/
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
	String str="fffaaaabbbbcccddde";
	StringBuilder sb=new StringBuilder(str);
	String res="";
	res=res+str.charAt(0);
	int len=str.length();
	for(int i=1;i<len;i++)
	{
	    char curr=str.charAt(i);
	    char prev=str.charAt(i-1);
	    if(curr!=prev)
	    {
	        res+=curr;
	    }
	}
	System.out.print(res);
	
	}
}
