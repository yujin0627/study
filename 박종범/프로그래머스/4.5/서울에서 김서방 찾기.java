package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static String solution(String[] seoul) {
       
    	String ans="";
    	int x=0;
    	for(int i=0; i<seoul.length;i++) {
    	   if(seoul[i].equals("Kim")) {
    		  x=i;
    	   }    	  
    	}
    	ans="김서방은 "+x+"에 있다";
    	
    	return ans;
    }
        
        

        
    



	 
    
	       
	
	public static void main(String[] args) {
		
		String[] seoul= {"Jane", "Kim"};
		System.out.println(solution(seoul));
	}
    
}

	


