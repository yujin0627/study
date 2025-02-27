package feb;

public class Feb02_26_01 {

//	문자열 myString과 pat이 주어집니다. 
//	myString에서 pat이 등장하는 횟수를 return 하는 
//	solution 함수를 완성해 주세요.
	
	public int solution(String myString, String pat) {
        int answer = 0;
        
        while(true) {
        	
        	if(myString.indexOf(pat)+1 == myString.length()) {
        		answer++;
        		break;
        	} else if(myString.indexOf(pat) >= 0) {
        		myString = myString.substring(myString.indexOf(pat)+1);
        		answer++;
        		
        	} else if (myString.indexOf(pat) < 0) {
        		break;
        	}
        	
        }
        
        return answer;
    }
	
	
	public static void main(String[] args) {
		
		
		
		String str = "안녕하세요? 문자열은 문자의 합 입니다";
		String str2 = str.substring(13);
		
		
		int a = str2.indexOf("문자의 합"/*문자열*/);

		System.out.println("'문자의 합'이 발견된 위치:" + a);
		System.out.println(str.substring(12));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
