package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static String solution(String s) {
        String[] sarr=s.split(" ");
        int[] arr=new int[sarr.length];
        for(int i=0;i<sarr.length;i++) {
        	arr[i]=Integer.parseInt(sarr[i]);
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=0; i<arr.length;i++) {
        	if(max<arr[i]) {
        		max=arr[i];
        	}
        	if(min>arr[i]) {
        		min=arr[i];
        	}       	
        }
       
        String ans="";
        ans=min+" "+max;

        return ans;       
    }



    public static void main(String[] args) {
    	String s= "-1 -1";
    	System.out.println(solution(s));
    }
}

   
    


	
		
		
	

	
	
	
	
