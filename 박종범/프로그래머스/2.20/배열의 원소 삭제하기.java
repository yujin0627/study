package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static int[] solution(int[] arr, int[] delete_list) {
    	List<Integer> list=new ArrayList<Integer>();
    	List<Integer> dellist=new ArrayList<Integer>();
    	List<Integer> ans=new ArrayList<Integer>();
    	
    	for(int i=0;i<arr.length;i++) {    		
    		list.add(arr[i]);
    	}
    	for(int i=0;i<delete_list.length;i++) {    		
    		dellist.add(delete_list[i]);
    	}
    	for(int i=0;i<dellist.size();i++) {
    		list.remove(dellist.get(i));
    	}
    	
//    	for(int i=0;i<list.size();i++) {
//    		for(int j=0;j<dellist.size();j++) {
//    			if(list.get(i)==dellist.get(j)) {
//    				list.remove(dellist.get(j));
//    			}
//    		}
//    	}
    	int[] ians=new int[list.size()];
    	for(int i=0; i<list.size();i++) {
    		ians[i]=list.get(i);
    	}
    	return ians;
    
    }


    public static void main(String[] args) {
    	int[] arr= {293, 1000, 395, 678, 94};
    	int[] delete_list= {94, 777, 104, 1000, 1, 12};
    	System.out.println(Arrays.toString(solution(arr, delete_list)));
	}
}

   
    


	
		
		
	

	
	
	
	
