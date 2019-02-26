 class demo
{
	public static void main(String []ar)
	{
		Scanner sc=new Scanner(System.in);
		
		
		try
		{
		int n=sc.nextInt();
		String []a=new String[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.next();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(isPlainDrome(a[i]));
		}
		}
		catch(Exception e)
		{
			System.out.println("NO");
		}
		//System.out.println(isPlainDrome("ABC#&CBA"));
	}
	
	public static String isPlainDrome(String str)
	{
		String b="";
		String a="";
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLetter(str.charAt(i)))
			{
				a=a+str.charAt(i);
			}
			if(Character.isDigit(str.charAt(i)))
			{
				a=a+str.charAt(i);
			}
			
		}
		String temp=a.toLowerCase();
		
		for(int i=temp.length()-1;i>=0;i--)
		{
			b=b+temp.charAt(i);
		}
		
		if(temp.equalsIgnoreCase(b))
		{
			return "YES";
		}
		
		return "NO";
		
	}
}