package codingtest;

/*
 * strArr	result
["and","notad","abcd"]	["and","abcd"]
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static String[] solution(String[] strArr) {
    	List<String> list =new ArrayList<String>();
    	List<String> list2 =new ArrayList<String>();
        for(int i=0; i<strArr.length;i++) {
        	list.add(strArr[i]);
        }
       
        for(int i=0; i<list.size();i++) {
        	if(!list.get(i).contains("ad")) {
        		list2.add(list.get(i));
        	}
        }
        String[] ans= new String[list2.size()];
        for(int i=0;i<list2.size();i++) {
        	ans[i]=list2.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
    	 String[] strArr = {"and", "notad", "abcd"};
         System.out.println(Arrays.toString(solution(strArr)));
    	
	}
}

   
    


	
		
		
	

	
	
	
	
