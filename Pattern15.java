/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
Pattern 15
    1     
  2 3 2   
3 4 5 4 3 
  2 3 2   
    1 
    
*/    

public class Main
{
	public static void main(String[] args) {
	   //	System.out.println("Hello World");
	   int n=5;
	   int sp=n/2;
	   int st=n-2*sp;
	   int count=1;
	   int j;
	   for(int i=1;i<=n;i++)
	   {
	       for( j=1;j<=sp;j++)
	       System.out.print("  ");
	       int r=count;
	       for( j=1;j<=st;j++){
	           
	       System.out.print(r+" ");
	       if(j<=st/2)
	           r++;
	           else
	           r--;
	      
	       
	       
	       }
	       for(j=1;j<=sp;j++)
	       System.out.print("  ");
	       
	       System.out.print("\n");
	       
	       if(i<=n/2)
	       {   count++;
	           st+=2;
	           sp--;
	       }
	       else{
	           count--;
	           st-=2;
	           sp++;
	       }

	       
	   }
	}
}
