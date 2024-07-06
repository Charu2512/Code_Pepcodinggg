/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
Output
5040
*/

public class Main
{   
    public static int fact(int n)
{
    if(n==1)
    return 1;
    return n*fact(n-1);
}
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int res=fact(7);
		System.out.println(res);
	}
}
