package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {
    public static String solution(String s) {
        String[] str=s.split(""); // [z,h,e,l,l,o]
        Map<String, Integer> map =new HashMap<String, Integer>();
        
        // 문자열에서 각 문자 등장 횟수 세기
        for(int i=0;i<str.length;i++) {
        	if(!map.containsKey(str[i])) {
        		//map안에 없으면 1대입
        		map.put(str[i], 1);
        	}else {
        		//map안에 값 있으면 값+1 대입
        		map.put(str[i], map.get(str[i])+1);
        	}
        }
        System.out.println(map.toString());  //{e=1, h=1, z=1, l=2, o=1}
  
        // value값이 1인것만 list에 담기
        Set<String> key=map.keySet();
        List<String> list =new ArrayList<String>();
        
        for(String a : key) {
        	if(map.get(a)==1) {
        		list.add(a);        		
        	}
        }
        System.out.println(list.toString());
        

        
        //list배열을 String배열로 바꾸기
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
//	List<String> list2 =new ArrayList<String>();
//	list2.add(a);
    
//  Collections.sort(list2);
//  System.out.println(list2.toString());        
//  StringBuilder result = new StringBuilder();
//  for (String ch : list2) {
//      result.append(ch);
//  }
//  System.out.println(result.toString());



   
    public static void main(String[] args) {
    	String s="zhello";
    	System.out.println(solution(s));
    			
    }
		

}


	 
    


	

