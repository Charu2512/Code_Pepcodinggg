/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
Output
1024
*/

public class Main
{   public static int power(int x, int n)
{   if(n==0)
return 1;
    return x*power(x,n-1);
}
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int res=power(2,10);
		System.out.println(res);
	}
}
