
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		for(int i=0;i<a;i++){
			int b=sc.nextInt();
			int c[]=new int[b];
			for(int j=0;j<b;j++){
				c[j]=sc.nextInt();
			}
			Arrays.sort(c);
			int index=sc.nextInt();
			System.out.println(c[index-1]);
		}
		
		
	}
}