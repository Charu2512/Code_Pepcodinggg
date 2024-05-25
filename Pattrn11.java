/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
Pattern 11
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15
*/

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int n=5;
		int count=1;
		for(int i=1;i<=n;i++)
		{
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print(count+ " ");
		        count++;
		    }
		    System.out.print("\n");
		}
		
	}
}
