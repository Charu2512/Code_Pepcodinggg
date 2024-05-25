/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.


*******************************************************************************/

/*

Pattern 16
1               1 
1 2           2 1 
1 2 3       3 2 1 
1 2 3 4   4 3 2 1 
1 2 3 4 5 4 3 2 1 
*/

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		int n=5;
		int col=2*n-1;
		int st=1;
		int sp=col-2*st;
		
		for(int i=1;i<=n;i++)
		{   
		    int val=1;
		    for(int j=1;j<=st;j++)
		    {System.out.print(val+" ");
		        val++;
		    }
		    
		    for(int j=1;j<=sp;j++)
		    {System.out.print("  ");}
		    
		    val--;
		    
		    
		    if(sp<=0){ val--;
		    for(int j=1;j<st;j++)
		    {System.out.print(val+" ");
		        val--;
		    }
		        
		    }
		    else{
		        for(int j=1;j<=st;j++)
		    {System.out.print(val+" ");
		        val--;
		    }
		    }
		    
		    System.out.print("\n");
		    st++;
		    sp-=2;
		    
		}
		
		
	}
}
