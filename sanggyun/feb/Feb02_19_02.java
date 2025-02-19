package feb;

public class Feb02_19_02 {

//	정수가 담긴 리스트 num_list가 주어질 때, 
//	리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합을 
//	10 이하이면 모든 원소의 곱을 return하도록 solution 
//	함수를 완성해주세요.

	public int solution(int[] num_list) {
        int answer = 1;
        
        if(num_list.length > 10) {
        	for(int i = 0; i<num_list.length; i++) {
        		answer += num_list[i];
        	}
        	answer = answer-1;
        } else {
        	for(int i=0; i<num_list.length; i++) {
        		answer *= num_list[i];
        	}
        }
        
        return answer;
    }
	
	
}
