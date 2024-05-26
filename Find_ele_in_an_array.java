/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
//Find element in an array
//Output 2

public class Main
{   
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int n=5;
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=i+1;
		}
		int idx=-1;
		int ele=3;
		
		for(int i=0;i<n;i++)
		{
		    if(arr[i]==ele)
		    {
		        idx=i;
		    }
		}
		
		System.out.print(idx);
		
		
	}
}
