package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static String solution(String cipher, int code) {
    	List<String> list = new ArrayList<String>();
    	String[] arr=cipher.split("");
    	for(int i=0; i<arr.length;i++) {
    		if((i+1)%code==0) {
    			list.add(arr[i]);
    		}
    	}
    	String ans="";
    	for(int i=0; i<list.size();i++) {
    		ans+=list.get(i)+"";
    	}
    
    	return ans;
}



   
    public static void main(String[] args) {
    	String cipher="dfjardstddetckdaccccdegk";
    	int code=4;
    	System.out.println(solution(cipher, code));
    			
    }
		

}


	 
    


	

