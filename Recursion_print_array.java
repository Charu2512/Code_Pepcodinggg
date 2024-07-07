/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
Output
1
2
3
4
5
*/

public class Main
{   public static void disp_arr(int[] arr,int idx)
{   if(idx==arr.length)
    return;
    System.out.println(arr[idx]);
    disp_arr(arr,idx+1);
}
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		arr[i]=i+1;
		disp_arr(arr,0);
	}
}
