                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
//INVERSE OF A NUMBER
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int num=21453;
		int sum=0;
		int i=1;
		while(num!=0)
		{
		    int a=num%10;
		    num=num/10;
		    sum+=i*(Math.pow(10,a-1));
		    i++;
		}
		
		System.out.println(sum);
	}
}
