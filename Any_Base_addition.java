/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

//Output 1212

public class Main
{   public static int any_base_add(int a, int b, int base)
{
    int sum=0;
    int carry=0;
    int p=1;
    while(a>0 || b>0 || carry>0)
    {
        int d1=a%10;
        int d2=b%10;
        a=a/10;
        b=b/10;
        int d3=d1+d2+carry;
        carry=d3/base;
        d3=d3%base;
        sum+=d3*p;
        p*=10;
        
        
        
        
    }
    
    return sum;
        
    }
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		int res=any_base_add(236,754,8);
		System.out.print(res);
	}
}
