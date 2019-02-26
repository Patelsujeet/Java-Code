
class GFG
{
	public static void main(String []ae)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
			
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			int temp=a[i];
			int b[]=new int[temp];
			int x=0;
			
			long count=0;
			List<Long> list_data=new ArrayList<Long>();
			for(long j=1;j<10000;j++)
			{
				
				if(j%2!=0)
				{
					if(x<b.length)
					{
						list_data.add(j);
						x++;
					}
				}
				
			}
			for(long arr:list_data)
			{
				count=count+squar(arr);
			}
			System.out.println(count);
			
		}
			
	}
	
	public static long squar(long a)
	{
		return a*a;
	}
}