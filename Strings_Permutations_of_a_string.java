/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
Output
abc
bac
cab
acb
bca
cba
*/

public class Main
{ 
    public static int fact(int n)
    {
        int res=1;
        for(int i=1;i<=n;i++)
        {
            res*=i;
        }
        return res;
    }
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		String str="abc";
		
		int len=str.length();
		
		int val=fact(len);
		for(int i=0;i<val;i++)
		{   StringBuilder sb=new StringBuilder(str);
		    int temp=i;
		    for(int j=len;j>=1;j--)
		    {
		        int q=temp/j;
		        int r=temp%j;
		        System.out.print(sb.charAt(r));
		        sb.deleteCharAt(r);
		        temp=q;
		    }
		    System.out.println();
		}
	}
}
