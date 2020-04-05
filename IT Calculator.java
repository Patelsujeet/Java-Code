



import java.util.*;
import java.math.BigDecimal;

public class HelloWorld{

     public static void main(String []args){
        float total=98000000;
		float slab=250000;
		float b=total/slab;
		float point=total%slab;
		
		
		Map<Integer,Integer> m=new HashMap<Integer,Integer>();
		m.put(0,0);
		m.put(1,12500);
		m.put(2,25000);
		m.put(3,37500);
		m.put(4,50000);
		m.put(5,62500);
		
		Map<Integer,Integer> m_slab=new HashMap<Integer,Integer>();
		m_slab.put(0,0);
		m_slab.put(1,5);
		m_slab.put(2,10);
		m_slab.put(3,15);
		m_slab.put(4,20);
		m_slab.put(5,25);
		m_slab.put(6,30);
		
		
		float temp=0;
		float remain=0;
		if(total>1500000){
		    remain=total-1500000;
		}
		System.out.println(remain);
		for(int i=0;i<=b;i++){
		   
		   if(i>5){
		       temp=temp+(remain*30)/100;
		       break;
		   }
		    if(i==b && temp<=250000){
		        float c=point*m_slab.get(b)/100;
		        temp=temp+c;
		         
		    }
		    else{
		         temp=temp+m.get(i);
		    }
		    System.out.println(m.get(i)+":"+temp);
		   
		}
		float totalTax=temp + (temp*4)/100;
		System.out.print(new BigDecimal(totalTax).toPlainString());
		
		
		
         
         
     }
}
