/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
Output
40
50
*/

public class Main
{
	public static void main(String[] args) {
	//	System.out.println("Hello World");
	int a=10;
	int[] arr=new int[a];
	
	for(int i=0;i<a;i++)
	{
	    arr[i]=10*(i+1);
	}
	
	int val=49;
	int ceil=0;
	int floor=0;
	int low=0;
	int high=a-1;
	while(low<=high)
	{
	    int mid=(low+high)/2;
	    if(arr[mid]<val)
	    {
	        low=mid+1;
	        floor=arr[mid];
	    }
	    else if(arr[mid]>val)
	    {
	        high=mid-1;
	        ceil=arr[mid];
	    }
	    else{
	        floor=arr[mid];
	        ceil=arr[mid];
	        break;
	    }
	}
	
	System.out.println(floor);
	System.out.println(ceil);
	
	}
}
