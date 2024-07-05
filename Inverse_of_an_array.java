/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
Output
34120
42301
*/

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int len=5;
		int[] arr=new int[len];
		
		arr[0]=3;
		arr[1]=4;
		arr[2]=1;
		arr[3]=2;
		arr[4]=0;
		
		
		for(int i=0;i<len;i++)
		{
		    System.out.print(arr[i]);
		}
		
		System.out.print("\n");
		
		
		int[] rev_arr=new int[len];
		for(int i=0;i<len;i++)
		{
		   int temp=arr[i];
		   rev_arr[temp]=i;
		}
		
		
		for(int i=0;i<len;i++)
		{
		    System.out.print(rev_arr[i]);
		}
		
	}
}
