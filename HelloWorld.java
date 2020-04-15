public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        int []ar={3,4,3,5,6,8,9,10};
		int p=0;
		int c=0;
		
		while(p<ar.length){
		    if(ar[p]%2==0){
		        int temp;
		        temp=ar[p];
		        ar[p]=ar[c];
		        ar[c]=temp;
		        c++;
		        p++;
		    }
		    else{
		        p++;
		    }
		}
		for(int i=0;i<ar.length;i++){
		    System.out.println(ar[i]);
		}
		
     }
}
