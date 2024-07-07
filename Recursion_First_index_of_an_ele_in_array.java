/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
Output
5
Better approach in Pepcoding video
*/

public class Main
{   public static int first_index(int[] arr, int ele, int idx)
{   if(idx==arr.length-1)
{
    if(arr[idx]==ele)
    return idx;
    else
    return -1;
}
    int first_id=first_index(arr,ele,idx+1);
    if(ele==arr[idx])
    return idx;
    else
    return first_id;
    
}
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int[] arr=new int[10];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=9;
		arr[4]=4;
		arr[5]=5;
		arr[6]=6;
		arr[7]=7;
		arr[8]=8;
		arr[9]=5;
		int res=first_index(arr,5,0);
		System.out.println(res);
		
	}
}
