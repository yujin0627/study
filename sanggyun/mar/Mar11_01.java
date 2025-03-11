package Mar;

import java.util.*;

public class Mar11_01 {

//	정수로 이루어진 리스트 num_list가 주어집니다. 
//	num_list에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 
//	담은 리스트를 return하도록 solution 함수를 완성해주세요.
	
	public int[] solution(int[] num_list) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        
        for(int i =0; i<num_list.length; i++) {
        	list.add(num_list[i]);
        }
        
        Collections.sort(list);
        
        for(int i =5; i<list.size(); i++) {
        	list2.add(list.get(i));
        }
        
        
        int[] answer = new int[list2.size()];
        
        for(int i = 0; i<list2.size(); i++) {
        	answer[i] = list2.get(i);
        }
        
        return answer;
    }
	
	
	
}
