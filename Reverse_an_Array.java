/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//Output
//12345
//54321

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int a=5;
		int[] arr=new int[a];
		
		for(int i=0;i<a;i++)
		{
		    arr[i]=i+1;
		}
			for(int i=0;i<a;i++)
		{
		   System.out.print(arr[i]);
		}
		System.out.print("\n");
		int low=0;
		int high=a-1;
		while(low<high)
		{
		    int temp=arr[low];
		    arr[low]=arr[high];
		    arr[high]=temp;
		    
		    low++;
		    high--;
		}
		
			for(int i=0;i<a;i++)
		{
		   System.out.print(arr[i]);
		}
	}
}
