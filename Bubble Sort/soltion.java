import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception
    {
		Scanner sc=new Scanner(System.in);
		
		int len=sc.nextInt();
        int a[]=new int[len];
        int swapCounter=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();	
		}
		
		int temp;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-1;j++)
            {
				if(a[j]>a[j+1])
				{	
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					swapCounter++;
				}	                
            }	
        }
		System.out.println(swapCounter);
    }
}
