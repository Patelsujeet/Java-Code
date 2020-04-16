public class HelloWorld{

     public static void main(String []args){
        int []ar={3,2,3,5,6,8,91,100,9,7,4};
		int p=0;
		int c=0;
		differentiate(ar,p,c);
		for(int i=0;i<ar.length;i++){
		    System.out.println(ar[i]);
		}
     }
     
     public static void differentiate(int []ar,int p,int c){
        if(p<ar.length){
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
		    differentiate(ar,p,c);
        }  
          
     }
}
