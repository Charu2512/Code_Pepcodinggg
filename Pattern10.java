/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
 Pattern 9

  
      *       
    *   *     
  *       *   
*           * 
  *       *   
    *   *     
      *   
  
  
  
  
*/
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int n=7;
		int l=n/2;
		int r=l;
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        if(j==l || j==r)
		        System.out.print("* ");
		        else
		        System.out.print("  ");
		    }
		    if(i<n/2)
		    {
		        l--;
		        r++;
		    }
		    else{
		        l++;
		        r--;
		    }
		    System.out.print("\n");
		}
	}
}
