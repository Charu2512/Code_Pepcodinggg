/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

//Pattern
* * * * *
  * * * *
    * * *
      * *
        *
  
  

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int n=5;
		for(int i=1;i<=n;i++)
		{   int sp=i-1;
		    int st=n-sp;
		    int j;
		   for(j=1;j<=sp;j++)
		    {
		        System.out.print("  ");
		    }
		    while(j<=n){
		    System.out.print("* ");
		        j++;
		    }
		    
		    System.out.println("\n");
		}
	
}
}
