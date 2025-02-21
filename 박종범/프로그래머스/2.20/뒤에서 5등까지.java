package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static int[]  solution(int[] num_list) {
       Arrays.sort(num_list);
       List<Integer>list=new ArrayList<Integer>();
       for(int i=0; i<num_list.length;i++) {
    	   list.add(num_list[i]);
       }
       int[] ans=new int[list.size()-5];
       for(int i=5;i<list.size();i++) {
    	   ans[i-5]=list.get(i);
       }
       return ans;
    }

    public static void main(String[] args) {
    	 int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
         System.out.println(Arrays.toString(solution(num_list)));
    	
	}
}

   
    


	
		
		
	

	
	
	
	
