public class Simple
{
	public static void main(String []s)
	{
		int []a=new int[255];
		int []b=new int[255];
		int c=100;
		
		a[0]=1;//initialization  
		a[1]=2;  
		a[2]=7;  
		a[3]=4;  
		a[4]=5;  
		
		b[0]=1;//initialization  
		b[1]=2;  
		b[2]=7;  
		b[3]=4;  
		b[4]=5; 
		
		
				if(isSummationExist(a,b,c)){
					System.out.println("SuccessFully Found");
				}
				else if(!isSummationExist(a,b,c)){
					System.out.println("Not Found");
				}
		
	}
	
	public static boolean isSummationExist(int []a,int []b,int digit){
		
		for(int a_list:a){
			for(int b_list:b){
				if((a_list+b_list)==digit){
					System.out.println("Digit"+a_list+"+"+b_list+"="+digit);
					return true;
				}
				
			}
		}
		
		return false;
	}
}