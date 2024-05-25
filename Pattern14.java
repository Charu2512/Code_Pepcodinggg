/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
Pattern 14

5 * 1 = 5 
5 * 2 = 10 
5 * 3 = 15 
5 * 4 = 20 
5 * 5 = 25 
5 * 6 = 30 
5 * 7 = 35 
5 * 8 = 40 
5 * 9 = 45 
5 * 10 = 50
*/

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int n=5;
		
		    for(int j=1;j<=10;j++)
		    {
		        System.out.print(n+" * "+j+" = "+ n*j+" ");
		        System.out.print("\n");
		    }
		    
		
	}
}
