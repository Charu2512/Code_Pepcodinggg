/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

//Pattern

* * *   * * * 

* *       * * 

*           * 

* *       * * 

* * *   * * *

  
  
  

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int n=5;
		int col=n+2;
		
		int rst=(n+1)/2;
		    
		    int lst=rst;
		    int sp=col-2*rst;
		    int i;
		for( i=0;i<n;i++)
		{   
		    
		    int j;
		   for(j=1;j<=lst;j++)
		    {
		        System.out.print("* ");
		    }
		    for(j=1;j<=sp;j++)
		    {
		        System.out.print("  ");
		    }
		    
		    for(j=1;j<=lst;j++)
		    {
		        System.out.print("* ");
		    }
		    
		    
		   System.out.println("\n");
		   if(i<(n/2))
		   {
		   sp+=2;
		   lst--;
		       
		   }
		   else{
		        sp-=2;
		        lst++;
		   }
		}
		
	
}
}
