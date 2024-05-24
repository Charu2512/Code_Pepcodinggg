/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
//Print Prime Factorization of a number
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
	int a=72;
	int num=a;
	for(int i=2;i<=a;i++)
	{
	    while(num%i==0 )
	    {
	        num=num/i;
	        System.out.println(i);
	    }
	    if(num==1)
	    {break;}
	}
	}
}
