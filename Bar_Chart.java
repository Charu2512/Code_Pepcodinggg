/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
//Bar Chart  
/*  
    *
   **
  ***
 ****
*****
*****

*/


public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		int n=5;
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=i+2;
		}
		int max=arr[0];
		for(int i=0;i<n;i++)
		{
		    if(arr[i]>max)
		    max=arr[i];
		}
		
		for(int j=max;j>=1;j--)
		{
		    for(int k=0;k<n;k++)
		    {
		        if(arr[k]>=j)
		        {
		            System.out.print("*");
		        }
		        else{
		            System.out.print(" ");
		        }
		    }
		    System.out.print("\n");
		}
	}
}
