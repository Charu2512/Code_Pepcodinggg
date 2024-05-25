/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

//output=6

public class Main
{   public static int digit_freq(int number,int k)
{
    int count=0;
    while(number!=0)
    {
        int a=number%10;
        if(a==k)
        count++;
        number=number/10;
    }
    
    return count;
}
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		int num=12112111;
		int res=digit_freq(num,1);
		System.out.print(res);
		
		
	}
}
