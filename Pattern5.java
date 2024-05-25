/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

//Pattern
      *
    * * *
  * * * * *
    * * * 
      *
  
  
  

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int n=7;
		
		int rsp=(n-1)/2;
		    
		    int lsp=rsp;
		    int st=n-2*rsp;
		    int i;
		for( i=0;i<=rsp;i++)
		{   
		    
		    int j;
		   for(j=1;j<=lsp;j++)
		    {
		        System.out.print("  ");
		    }
		    for(j=1;j<=st;j++)
		    {
		        System.out.print("* ");
		    }
		    
		    for(j=1;j<=lsp;j++)
		    {
		        System.out.print("  ");
		    }
		    
		    
		   System.out.println("\n");
		   st+=2;
		   lsp--;
		}
		
		 st-=2;
		   lsp++;
		   
		while(i<n)
		{
		    st-=2;
		    lsp++;
		     
		    int j;
		   for(j=1;j<=lsp;j++)
		    {
		        System.out.print("  ");
		    }
		    for(j=1;j<=st;j++)
		    {
		        System.out.print("* ");
		    }
		    
		    for(j=1;j<=lsp;j++)
		    {
		        System.out.print("  ");
		    }
		    
		    i++;
		    System.out.println("\n");
		}
	
}
}
