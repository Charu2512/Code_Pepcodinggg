/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

/*
Pattern 17

      * 
      * * 
      * * * 
* * * * * * * 
      * * * 
      * * 
      * 
      
      
*/

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int n=7;
		int sp=n/2;
		int st=1;
		for(int i=1;i<=n;i++)
		{
		    if(i==(n+1)/2)
		    {
		        for(int l=1;l<=n;l++)
		        System.out.print("* ");
		    }
		    
		    else{
		    
		    for(int j=1;j<=sp;j++)
		    {
		        System.out.print("  ");
		    }
		    
		    for(int k=1;k<=st;k++)
		    {
		        System.out.print("* "); 
		    }
		   
		    }
		    
		    
		    if(i<=n/2)
		    {
		        st++; 
		    }
		    else{
		        st--;
		    }
		
		 System.out.print("\n");
	}
		 
	}
}
