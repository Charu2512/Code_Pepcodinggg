/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

//Output  109998

public class Main
{
	public static void main(String[] args) {
		//.out.println("Hello World");
		
		int n1=5;
		int n2=4;
		int n3=(n1>n2)?n1:n2;
		
		int[] arr1=new int[n1];
		for(int i=0;i<n1;i++)
		arr1[i]=9;
		
		int[] arr2=new int[n2];
		for(int i=0;i<n2;i++)
		arr2[i]=9;
		
	
		int[] sum=new int[n3];
		
		int j=arr1.length-1;
		int k=arr2.length-1;
		int l=sum.length-1;
		
		int c=0;
		int res;
		while(l>=0)
		{
		    res=c;
		    if(j>=0)
		    res+=arr1[j];
		    if(k>=0)
		    res+=arr2[k];
		    
		    sum[l]=res%10;
		    c=res/10;
		    j--;
		    k--;
		    l--;
		    
		}
		
		if(c!=0)
		{
		    System.out.println(c);
		    
		}
		
		for(int p=0;p<n3;p++)
		{
		    System.out.println(sum[p]);
		}
		
		
	}
}
