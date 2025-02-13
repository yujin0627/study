package codingtest;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Solution {
    public static String[] solution(String my_string) {
    	String[] sarr=my_string.split(" ");
    	List<String> list = new ArrayList<String>();    	
    	for(int i=0; i<sarr.length;i++) {
    		if(!sarr[i].isEmpty()) {
    		list.add(sarr[i].trim());
    	
    		}
    	}
    	String[] ans=new String[list.size()];
    	for(int i=0;i<list.size();i++) {
    		ans[i]=list.get(i);
    	}
    	
    	
    	return ans;
    }



   
    public static void main(String[] args) {
    	String my_String=" i    love  you";
    	System.out.println(Arrays.toString(solution(my_String)));
    }
		

}


	 
    


	


