package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static int[] solution(int[] arr) {
    	if(arr.length==1) {
    		return new int[]{-1};
    	}
    	int min=arr[0];
    	List<Integer> list =new ArrayList<Integer>();
    	for(int i=0;i<arr.length;i++) {
    			if(arr[i]<min) {
    			min=arr[i];
    		}
    	}
    	for(int a:arr) {
    		if(a!=min) {
    			list.add(a);
    		}
    	}
    	int[] ans=new int[list.size()];
    	for(int i=0;i<list.size();i++) {
    		ans[i]=list.get(i);
    	}
    	return ans;

    	
    	
    }


    public static void main(String[] args) {
    	String[] strArr=new String[] {"a","bc","d","efg","hi"};
    	System.out.println(solution(strArr));
    }
}

   
    


	
		
		
	

	
	
	
	
