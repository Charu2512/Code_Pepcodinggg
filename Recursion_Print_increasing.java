/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
Output
1 2 3 4 5 6 7 8 9 10
*/
public class Main
{
    
    public static void print_inc(int n)
    {
        if(n==0)
        return;
        print_inc(n-1);
        System.out.print(n);
        System.out.print(" ");
        
        
    }
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		print_inc(10);
		
	}
}
