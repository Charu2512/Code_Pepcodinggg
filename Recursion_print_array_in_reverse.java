/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
Output
6
5
4
3
2
1
*/

public class Main
{   public static void disp_arr_reverse(int[] arr,int idx)
{   if(idx==arr.length)
    return;
    
    disp_arr_reverse(arr,idx+1);
    System.out.println(arr[idx]);
}
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int[] arr=new int[6];
		for(int i=0;i<arr.length;i++)
		arr[i]=i+1;
		disp_arr_reverse(arr,0);
	}
}
