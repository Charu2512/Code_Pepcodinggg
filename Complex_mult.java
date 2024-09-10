/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
//Complex_Number_Multiplication
//Output---0+8i
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		String a="2+2i";
		String b="2+2i";
		int p=Integer.parseInt(a.substring(0,a.indexOf('+')));
		int q=Integer.parseInt(a.substring(a.indexOf('+')+1,a.length()-1));
		int r=Integer.parseInt(b.substring(0,b.indexOf('+')));
		int s=Integer.parseInt(b.substring(b.indexOf('+')+1,b.length()-1));
		
		String result=(p*r-q*s)+"+"+(p*s+q*r)+"i";
		System.out.println(result);

	}
}
