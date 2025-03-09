package codingtest;

import java.util.Arrays;

class Solution {
    public static long solution(int a, int b) {
        long sum=0;
    	if(a==3&&b==3) {
    		return a;
    	}else if(a!=b) {
    		if(a<b) {
    			for(int i=a;i<=+b;i++) {
    				sum+=i;
    			}
    			return sum;
    		}else {
    			for(int i=b;i<=+a;i++) {
    				sum+=i;
    			}
    			return sum;
    		}
    	}
		return 0;
    	
    }



   
    public static void main(String[] args) {
    	int a=3;
    	int b=5;
    	System.out.println(Arrays.toString(solution(x, n)));
    }
		

}


	 
    


	

