/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

//Output 1111010

public class Main
{    public static int any_base_to_dec(int num, int ba)
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

public static int dec_to_anybase(int num, int b)
{
    int sum=0;
    int i=0;
    while(num!=0)
    {
        int a=num%b;
        sum+=a*Math.pow(10,i);
        num=num/b;
        i++;
    }
    
    return sum;
}
    
    public static int any_base_to_any_base(int num, int b1, int b2)
{
    int num1=any_base_to_dec(num,b1);
    int num2=dec_to_anybase(num1,b2);
    return num2;
    
}
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		
		int num=172;
		int b1=8;
		int b2=2;
		
		int res=any_base_to_any_base(num,b1,b2);
		System.out.print(res);
	}
}
