/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
Output
1 2 3 4 5 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
2 
2 3 
2 3 4 
2 3 4 5 
3 
3 4 
3 4 5 
4 
4 5 
5 
*/

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		int len=5;
		int[] arr=new int[len];
		
		for(int l=0;l<len;l++)
		{
		    arr[l]=l+1;
		}
		
		for(int i=0;i<len;i++)
		{
		    System.out.print(arr[i]);
		    System.out.print(" ");
		}
		
		System.out.print("\n");
		for(int i=0;i<len;i++)
		{
		    for(int j=i;j<len;j++)
		    {
		        for(int k=i;k<=j;k++)
		        {
		            System.out.print(arr[k]);
		            System.out.print(" ");
		            
		        }
		        
		        System.out.print("\n");
		    }
		}
	}
}
