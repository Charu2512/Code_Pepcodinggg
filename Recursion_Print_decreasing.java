/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
Output
10 9 8 7 6 5 4 3 2 1
*/
public class Main
{
    
    public static void print_dec(int n)
    {
        if(n==0)
        return;
        System.out.print(n);
        System.out.print(" ");
        print_dec(n-1);
        
    }
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		print_dec(10);
		
	}
}
