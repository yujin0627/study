package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static String solution(String n_str) {
    	String[] arr=n_str.split("");
    	boolean flag=false;
    	String ans="";
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i].equals("0")) { //0등장
    			if(flag) {
    				ans+=arr[i];
    			}
    		}else { //다른숫자
    			flag=true;
    			ans+=arr[i];
    		}
    	}
    	return ans;
    }


    public static void main(String[] args) {
    	String n_str="854020";
    	System.out.println(solution(n_str));
	}
}

   
    


	
		
		
	

	
	
	
	
