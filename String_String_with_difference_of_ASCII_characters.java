/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
Output
a1b2d3g-4c-2a
*/

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		String str="abdgca";
		char ch=str.charAt(0);
		String res="";
		res=res+ch;
		for(int i=1;i<str.length();i++)
		{
		    char curr=str.charAt(i);
		    char prev=str.charAt(i-1);
		    int gap=curr-prev;
		    res+=gap;
		    res+=curr;
		}
		System.out.println(res);
	}
}
