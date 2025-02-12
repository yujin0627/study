package feb;

import java.util.ArrayList;

public class Feb02_12_01 {
	
//	정수 리스트 num_list와 정수 n이 주어질 때,
//	n 번째 원소부터 마지막 원소까지의 모든 원소를 
//	담은 리스트를 return하도록 solution 함수를 완성해주세요.
	
	class Solution {
	    public int[] solution(int[] num_list, int n) {
	        ArrayList<Integer> list = new ArrayList<>();
	        
	        for(int i = n-1; i < num_list.length; i++) {
	        	list.add(num_list[i]);
	        }
	        
	        int[] answer = new int[list.size()];
	        for(int i =0; i< answer.length; i++ ) {
	        	answer[i] = list.get(i);
	        }
	        
	        return answer;
	    }
	}
	
	
	
	
	
	
	
	
	
	
}
