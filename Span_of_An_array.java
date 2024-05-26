/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
//Span of an array
//Output 9
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
	int[] arr=new int[10];
	for(int i=0;i<10;i++)
	{
	    arr[i]=i;
	}
	
	int max=arr[0];
	for(int i=0;i<10;i++)
	{
	    if(arr[i]>max)
	    max=arr[i];
	}
	int min=arr[0];
	for(int i=0;i<10;i++)
	{
	    if(arr[i]<min)
	    min=arr[i];
	}
	
	
	int span=max-min;
	
	System.out.print(span);
	
	}
}
