/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
//Output
/*
1 2 3 4 5 6 7 8 
2 3 4 5 6 7 8 1 
*/

public class Main
{   
    public static void reverse_Array(int[] arr, int st , int end)
{
    int low=st;
    int high=end;
    while(low<high)
    {
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
        
        low++;
        high--;
    }
}
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		int len=8;
		int[] arr=new int[len];
		for(int i=0;i<len;i++)
		{
		    arr[i]=i+1;
		}
		
		for(int i=0;i<len;i++)
		{
		    System.out.print(arr[i]);
		    System.out.print(" ");
		    
		}
		
		System.out.print("\n");
		
		int k=-1;
		k=k%len;
		if(k<0)
		{
		    k=k+len;
		}
		reverse_Array(arr,0,len-k-1);
		reverse_Array(arr,len-k,len-1);
		reverse_Array(arr,0,len-1);
		
		for(int i=0;i<len;i++)
		{
		    System.out.print(arr[i]);
		    System.out.print(" ");
		    
		}
	
	}
}
