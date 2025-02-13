package feb;

import java.util.ArrayList;

public class Feb02_12_02 {

//	정수 리스트 num_list와 정수 n이 주어질 때,
//	num_list를 n 번째 원소 이후의 원소들과 n 번째까지의 원소들로
//	나눠 n 번째 원소 이후의 원소들을 n 번째까지의 
//	원소들 앞에 붙인 리스트를 return하도록 solution 함수를 완성해주세요.
	
	
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        for(int i = 0; i < n; i++) { //만약 n이 3이면 0,1,2 로 3개다
        	list.add(num_list[i]);
        }
        
        
    	for(int i = n; i < num_list.length; i++) {
        	list2.add(num_list[i]);
    	}
	     
        
        list2.addAll(list);
        
        int[] answer = new int[list2.size()];
        
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = list2.get(i);
        }
        
        return answer;
    }
	
	
	
	
}
