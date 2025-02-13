package programmers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Codding_뒤에서_5등_위로 {

	public static void main(String[] args) {
		
	}
	
	class Solution {
	    public int[] solution(int[] num_list) {
	        int[] answer = new int[num_list.length - 5];
	        int[] arr  = new int[num_list.length];
	        Arrays.sort(num_list);
	        
	        for(int i = num_list.length; i > num_list.length - 6; i--) {
	        	
	        	answer[i] = arr[i];
	        }
	        
	        Arrays.sort(answer);
	        
	        return answer;
	    }
	}
}
