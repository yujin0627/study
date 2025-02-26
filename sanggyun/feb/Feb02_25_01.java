package feb;

public class Feb02_25_01 {

//	문자열 myString과 pat가 주어집니다. 
//	myString의 부분 문자열중 pat로 끝나는 가장 긴 부분 
//	문자열을 찾아서 return 하는 solution 함수를 완성해 주세요.
	
	public String solution(String myString, String pat) {
        String answer = "";
    
        int a = myString.lastIndexOf(pat);
        
        answer = myString.substring(0, a+pat.length());
        
        return answer;
	
	}
	
	
	
}
