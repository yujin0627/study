package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {
    public static String solution(String s) {
        String[] str=s.split("");
        Map<String, Integer> map =new HashMap<String, Integer>();
        for(int i=0;i<str.length;i++) {
        	if(!map.containsKey(str[i])) {
        		map.put(str[i], 1);
        	}else {
        		map.put(str[i], map.get(str[i])+1);
        	}
        }
        Set<String> key=map.keySet();
        List<String> list =new ArrayList<String>();
        for(String a : key) {
        	if(map.get(a)==1) {
        		list.add(a);
        	}
        }
        String[] sarr=new String[list.size()];
        for(int i=0; i<list.size();i++) {
        	sarr[i]=list.get(i);
        }
        Arrays.sort(sarr);
        String ans="";
        for(int i=0;i<sarr.length;i++) {
        	ans+=sarr[i];
        }
        return ans;
    }




   
    public static void main(String[] args) {
    	String s="hello";
    	System.out.println(solution(s));
    			
    }
		

}


	 
    


	

