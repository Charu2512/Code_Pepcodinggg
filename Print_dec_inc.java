/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
Output
10 9 8 7 6 5 4 3 2 1 1 2 3 4 5 6 7 8 9 10
*/

public class Main
{
    public static void print_dec_inc(int n)
    {
        
        if(n==0)
        return;
        System.out.print(n+" ");
        print_dec_inc(n-1);
        System.out.print(n+" ");
        
    }
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int n=10;
		print_dec_inc(n);
	}
}
