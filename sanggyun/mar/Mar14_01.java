package Mar;

public class Mar14_01 {

//	한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 
//	각 자리수의 합을 return하도록 solution 함수를 완성해주세요.
	
	public int solution(String num_str) {
        int answer = 0;
        
        String[] str = num_str.split("");
        int[] arr = new int[str.length];
        
        for(int i =0; i<str.length; i++) {
        	arr[i] = Integer.parseInt(str[i]);
        }
        
        for(int i = 0; i< arr.length; i++) {
        	answer += arr[i];
        }
        
        return answer;
    }
	
	
}
