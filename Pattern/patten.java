class pattern
{
	public static void main(String []s){
		
		String a="Python";
		int row=a.length()%2==0?a.length()/2:(a.length()/2)+1;
		int col=a.length()%2==0?a.length()-1:a.length();
		String sub2=a.length()%2==0?a.substring((a.length()/2)):a.substring((a.length()/2)+1);		
		String sub1=a.length()%2==0?a.substring(0,a.length()/2):a.substring(0,(a.length()/2)+1);
		
		char []ch1=sub1.toCharArray();
		char []ch2=new StringBuffer(sub2).reverse().toString().toCharArray();
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(j<=i){
						if(i==j){
						System.out.print(ch1[i]);
						}
						else{
							System.out.print(" ");
						}
				}
				else{
					 System.out.print(" ");
				}
				
			}
			for(int j=ch2.length-1;j>=0;j--){
				if(i==j){
					System.out.print(ch2[j]);
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		
			System.out.println(sub1+":"+sub2);
	}
}