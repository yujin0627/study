package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static int solution(String binomial) {
       String[] op= {"+","-","*"};
       List<String> listop=new ArrayList<String>();
       List<String> bin=new ArrayList<String>();
       bin.add(binomial);
       for(int i=0;i<op.length;i++) {
    	   listop.add(op[i]);
       }
       String aop="";
       for(int i=0;i<op.length;i++) {
    	   if(binomial.contains(op[i])) {
    		   aop=op[i].toString();
    	   }
       }
       String[] ab=binomial.split("\\"+aop);
       int a, b=0;
       a=Integer.parseInt(ab[0].trim());
       b=Integer.parseInt(ab[1].trim());
       int c=0;
       switch (aop) {
		case "+":
			c=a+b;
			break;
		case "-":
			c=a-b;
			break;
		case "*":
			c=a*b;
			break;

		}
       
       return c;
       
       
    }



    public static void main(String[] args) {
     String binomial="43 + 12";
     System.out.println(solution(binomial));
    }
}

   
    


	
		
		
	

	
	
	
	
