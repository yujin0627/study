package Mar;

public class Mar31_02 {

//	정수로 이루어진 문자열 n_str이 주어질 때, n_str의 
//	가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 
//	return하도록 solution 함수를 완성해주세요.
	
	public String solution(String n_str) {
        String answer = "";
        String[] arr = n_str.split("");
        int check = 0;
        
        for(int i = 0; i < arr.length; i++) {
        	if(!arr[i].equals("0")) {
        		check = i;
        		break;
        	}
        }
        
        for(int i = check; i<arr.length; i++) {
        	answer += arr[i];
        }
        
        return answer;
    }
	
}
