
class geekscode
{
	public static void main(String []args)
	{
		int test;
		
		
		Scanner sc=new Scanner(System.in);
		
		test=sc.nextInt();
		int []a=new int[test];
		
		
		for(int i=0;i<test;i++)
		{
			a[i]=sc.nextInt();
		}
			
		for(int i=0;i<a.length;i++)
		{
			int temp=a[i];
			
			int odd=0,even=0;
			for(int j=0;j<=temp;j++)
			{
					if(j%2==0)
					{
						even=even+j;
					}
				    else
					{
						odd=odd+j;
					}
			}
			
			System.out.println(even+" "+odd);
		}	
	}
}