package feb;

public class Feb02_24_01 {

//	영소문자로 이루어진 문자열 my_string과 영소문자 1글자로 
//	이루어진 문자열 alp가 매개변수로 주어질 때, my_string에서 
//	alp에 해당하는 모든 글자를 대문자로 바꾼 문자열을 return 
//	하는 solution 함수를 작성해 주세요.
	
	public String solution(String my_string, String alp) {
        String answer = "";
        
        String[] arr = my_string.split("");
        
        for(int i =0; i < arr.length; i++) {
        	if(arr[i].equals(alp)) {
        		arr[i] = arr[i].toUpperCase();
        	}
        }
        
        for(int i = 0; i<arr.length; i++) {
        	answer += arr[i];
        }
        return answer;
    }
	
	
}
