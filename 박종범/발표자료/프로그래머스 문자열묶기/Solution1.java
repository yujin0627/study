package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution1 {
    public static int solution(String[] strArr) {
    	Map<Integer, Integer> map =new HashMap<Integer, Integer>();
    	for(int i=0;i<strArr.length; i++) {
        	int key=strArr[i].length();        	
        	if(!map.containsKey(key)) {
        		map.put(key,1);
        	}else {
        		map.put(key, map.get(key)+1);
        	}              	
        }
    	System.out.println(map.toString());
    	
    	Set<Integer> keyset=map.keySet();
    	
    	int max=0;
    	for(Integer a:keyset) {
    		max=Math.max(max, map.get(a));
    	}
    	
    	
    	return max;
    }

   
    public static void main(String[] args) {
    	String[] strArr=new String[] {"a","bc","d","efg","hi"};
    	System.out.println(solution(strArr));
    	
    }
		

}


	 
    


	

