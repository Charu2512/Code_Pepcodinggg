/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
//Output : 111001

public class Main
{   
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
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int num=57;
		int b=2;
		int res=dec_to_anybase(num,b);
		System.out.print(res);
	}
	
	
	
}
