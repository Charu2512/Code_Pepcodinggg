/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
Output
8
*/

public class Main
{   public static int last_index(int[] arr, int ele, int idx)
{   if(idx==arr.length-1)
{
    if(arr[idx]==ele)
    return idx;
    else
    return -1;
}
    int last_id=last_index(arr,ele,idx+1);
    if(last_id!=-1)
    return last_id;
    else
    {if(arr[idx]==ele)
        return idx;
        else 
        return -1;
    }
    
}
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int[] arr=new int[10];
		arr[0]=1;
		arr[1]=2;
		arr[2]=2;
		arr[3]=9;
		arr[4]=4;
		arr[5]=5;
		arr[6]=6;
		arr[7]=7;
		arr[8]=7;
		arr[9]=9;
		int res=last_index(arr,7,0);
		System.out.println(res);
		
	}
}
