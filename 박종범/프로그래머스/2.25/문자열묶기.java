package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {
    public static int solution(String[] strArr) {
    	int[] count=new int[strArr.length];    	
        for(int i=0;i<strArr.length;i++) {
        	count[i]=strArr[i].length();
        }

        Map<Integer, Integer> freq=new HashMap<>();
        for(int i=0;i<count.length;i++) {
        	freq.put(count[i], freq.getOrDefault(count[i], 0)+1);
        }
        Set<Integer> keyset=freq.keySet();
        int max=0;
        for(Integer a:keyset) {
        	if(freq.get(a)>max) {
        		max=freq.get(a);
        	}
        }
        System.out.println(freq.toString());
        return max;
}


    public static void main(String[] args) {
    	String[] strArr=new String[] {"a","bc","d","efg","hi"};
    	System.out.println(solution(strArr));
    }
}

   
    


	
		
		
	

	
	
	
	
