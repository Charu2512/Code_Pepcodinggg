/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
Output
5
*/

public class Main
{   public static int find_max(int[] arr , int idx)
   {  
    if(idx==arr.length-1)
    return arr[idx];
    int max_ele=find_max(arr,idx+1);
    if(arr[idx]>max_ele)
    return arr[idx];
    else
    return max_ele;
   }
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int[] arr=new int[5];
		for(int i=0;i<5;i++)
		{
		    arr[i]=i+1;
		}
		int res=find_max(arr,0);
		    System.out.print(res);
	}
}
