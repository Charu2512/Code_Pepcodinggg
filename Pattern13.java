/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
Pattern 13
1 
1 1 
1 2 1 
1 3 3 1 
1 4 6 4 1
*/

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		int n=5;
		
		for(int i=0;i<n;i++)
		{   int icj=1;
		    for(int j=0;j<=i;j++)
		    {
		        System.out.print(icj+" ");
		        int icjp1=icj*(i-j)/(j+1);
		        icj=icjp1;
		    }
		    System.out.print("\n");
		}
	}
}
