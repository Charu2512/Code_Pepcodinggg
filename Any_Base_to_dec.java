/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
//output 634

public class Main
{   public static int any_base_to_dec(int num, int ba)
{
    int res=0;
    int b=0;
    while(num!=0)
    {
        int a=num%10;
        res+=a*Math.pow(ba,b);
       b++;
        num=num/10;
        
    }
    
    return res;
}
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		
		int num=1172;
		int b=8;
		int res=any_base_to_dec(num,b);
		System.out.print(res);
	}
}
