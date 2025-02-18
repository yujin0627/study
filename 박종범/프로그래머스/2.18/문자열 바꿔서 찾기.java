package codingtest;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Solution {
    public String solution(int[] numbers, String hand) {
       String[] snumbers=new String[numbers.length];
       for(int i=0; i<numbers.length;i++) {
    	   snumbers[i]=numbers[i]+"";
       }
       //이차원배원
       String leftpos="*";
       String rightpos="#";
       for(int i=0; i<snumbers.length;i++) {
    	   if(snumbers.equals("1")) {
    		   snumbers[i]="L";
    		   leftpos="1";
    	   }else if(snumbers.equals("4")) {
    		   snumbers[i]="L";
    		   leftpos="4";
    	   }else if(snumbers.equals("7")) {
    		   snumbers[i]="L";
    		   leftpos="7";
    	   }else if(snumbers.equals("3")) {
    		   snumbers[i]="R";
    		   rightpos="3";
    	   }else if(snumbers.equals("6")) {
    		   snumbers[i]="R";
    		   rightpos="6";
    	   }else if(snumbers.equals("9")) {
    		   snumbers[i]="R";
    		   rightpos="9";
    	   }else { // 숫자 2, 5, 8 정해야댐
    		   
    	   }
    	   
    	   
    	   
       }
       
    }




   
    public static void main(String[] args) {
    	int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
    	String hand="right";
    
    }
		

}


	 
    


	


