/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
Pattern 12
0 
1 1 
2 3 5 
8 13 21 34 
55 89 144 233 377
*/

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int n=5;
		int a=0;
		int b=1;
		int c;
		for(int i=1;i<=n;i++)
		{
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print(a+ " ");
		        c=a+b;
		        a=b;
		        b=c;
		        
		    }
		    System.out.print("\n");
		}
		
	}
}
