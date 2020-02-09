

class doctoreSignPrint{
	public static void main(String []ar)
	{
		int a=11;
		int n=a/2;
		System.out.println(n);
		
		for(int i=0;i<a;i++){
			for(int j=0;j<a;j++){
				if(j==n){
					System.out.print("*");
				}
				else if(i==n){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}	
		System.out.println(" ");
		}			
	}
}