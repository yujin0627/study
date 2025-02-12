package codingtest;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Solution {
    public static String[] solution(String myString) {
    	String[] arr=myString.split("x");
    	List<String> list =new ArrayList<String>();
    	for(int i=0; i<arr.length;i++) {
    		if(!arr[i].isEmpty()) {
    			list.add(arr[i]);
    		}
    	}
    	String[] ans =new String[list.size()];
    	for(int i=0; i<ans.length;i++) {
    		ans[i]=list.get(i);
    		    	}
    	Arrays.sort(ans);
    	return ans;
    }


   
    public static void main(String[] args) {
    	String myString="dxxbbbxaaaa";
    	System.out.println(Arrays.toString(solution(myString)));
    }
		

}


	 
    


	


