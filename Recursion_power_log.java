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
{   public static int power_log(int x, int n)
{   if(n==0)
      return 1;
    int a=power_log(x,n/2);
    int res=a*a;
    if(n%2==1)
     res=res*x;
    
    return res;
}
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int res=power_log(2,10);
		System.out.println(res);
	}
}
