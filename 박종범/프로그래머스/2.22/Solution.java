package codingtest;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static int solution(int[] date1, int[] date2) {
       if(date1[0]<date2[0]) {
    	   return 1;
       }else if(date1[0]>date2[0]) {
    	   return 0;
       }else { //연도같다
    	   if(date1[1]<date2[1]) {
    		   return 1;
    	   }else if(date1[1]>date2[1]) {
    		   return 0;
    	   }else { //달 같다
    		   if(date1[2]<date2[2]) {
    			   return 1;
    		   }else{
    			   return 0;
    		   }
    	   }
       }
    }





    public static void main(String[] args) {
    int[] date1= {2024,12,28}; 
    int[] date2= {2024,12,29};
    System.out.println(solution(date1, date2));
    }
}

   
    


	
		
		
	

	
	
	
	
