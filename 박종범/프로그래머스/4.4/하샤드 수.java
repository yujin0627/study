package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public static boolean solution(int x) {
        String str =x+"";
        String[] sarr= str.split("");
        int sum=0;
        for(int i=0 ;i<sarr.length;i++) {
        	sum+=Integer.parseInt(sarr[i]);
        }
        if(x%sum==0) {
        	return true;
        }else {
        	return false;
        }
        
        
}
        
    



	 
    
	       
	
	public static void main(String[] args) {
		
		int x =13;
		System.out.println(solution(x));
	}
    
}

	


