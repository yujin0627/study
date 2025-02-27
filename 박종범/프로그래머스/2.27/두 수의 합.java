package codingtest;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static String solution(String a, String b) {
    	
	  BigInteger a1= new BigInteger(a);
	  BigInteger b1= new BigInteger(b);
     
	  BigInteger c1=a1.add(b1);
      
	  String ans= c1+"";
	  
	  
      return ans;
    }

    
    	

   
    public static void main(String[] args) {
    	String a="18446744073709551615";
    	String b="287346502836570928366";
    	System.out.println(solution(a, b));
    	
    }
		

}


	 
    


	


