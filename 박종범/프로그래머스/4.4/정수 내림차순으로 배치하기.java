package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public static long solution(long n) {
       String str =n+"";
       String[] sarr= str.split("");
       Arrays.sort(sarr);
       String a="";
       for(int i=0; i<sarr.length;i++) {
    	   a+=sarr[i];
       }
       StringBuilder sb =new StringBuilder(a);
       long ans = Long.parseLong(sb.reverse().toString());
       
       
       return ans;
    }
        
    



	 
    
	       
	
	public static void main(String[] args) {
		
		long n =118372;
		System.out.println(solution(n));
	}
    
}

	


