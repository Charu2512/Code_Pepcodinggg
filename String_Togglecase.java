/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
Output
PePCodiNG
*/
import java.io.*;
import java.util.*;

public class Main
{  
	public static void main(String[] args) {
		//System.out.println("Hello World");
		String str="pEpcODIng";
		StringBuilder sb=new StringBuilder(str);
		int len=sb.length();
		for(int i=0;i<len;i++)
		{
		    char ch=sb.charAt(i);
		    if(ch>='a' && ch<='z')
		    {
		        char uch=(char)('A'+ch-'a');
		        sb.setCharAt(i,uch);
		    }
		    
		    if(ch>='A' && ch<='Z')
		    {
		        char lch=(char)('a'+ch-'A');
		        sb.setCharAt(i,lch);
		    }
		}
		
		String res=sb.toString();
		System.out.println(res);
	}
}
