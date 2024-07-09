/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
Output
a
b
bccb
c
cc
c
cbc
b
c
*/

public class Main
{   public static boolean is_pallin(String str)
{
    int start=0;
    int end=str.length()-1;
    while(start<=end)
    {
        if(str.charAt(start)!=str.charAt(end))
        return false;
        start++;
        end--;
    }
    
    return true;
}
	public static void main(String[] args) {
		//System.out.println("Hello World");4
		
		String str="abccbc";
		for(int i=0;i<str.length();i++)
		{
		    for(int j=i+1;j<=str.length();j++)
		    {
		        String test=str.substring(i,j);
		        if(is_pallin(test))
		        {
		            System.out.println(test);
		        }
		    }
		}
		
	}
}
