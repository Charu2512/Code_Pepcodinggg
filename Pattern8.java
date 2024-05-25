/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

    * 
   *  
  *   
 *    
*  

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int n=5;
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        if(j==n-1-i)
		        System.out.print("* ");
		        else
		        System.out.print(" ");
		    }
		    System.out.print("\n");
		}
	}
}
