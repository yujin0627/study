package studypresentation;

import java.util.ArrayList;
import java.util.List;

public class pnregex {

}

class phoneregex {
    public String solution(String phone_number) { //정규표현식!
        
    	String answer = "";
        
    	//01033334444       예제폰번호
    	//2~3자리 - 3~4자리 - 마지막은 무조건 4자리
    	//(?=...) 긍정형 전방 탐색, 이 소괄호 앞을 전부 탐색
    	String pattern = ".(?=.{4})"; // .{4}가 의미하는게 전화번호 마지막 뒷 4자리 (폰넘버가 문자열으로 주어졌으므로)
    	
    	answer = phone_number.replaceAll(pattern, "*");
       
        return answer;
    }
}