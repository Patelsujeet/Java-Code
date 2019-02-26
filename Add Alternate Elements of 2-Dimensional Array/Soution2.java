
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        
        // Write your code here
      int a[]=new int[9];
		int b=0,c=0;
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
		    a[i]=s.nextInt();
		}
		
		
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				b=b+a[i];
				//System.out.println(a[i]);
			}
			else
			{
				c=c+a[i];
			}
		}
		System.out.println(b+"\n"+c);
    }
}
