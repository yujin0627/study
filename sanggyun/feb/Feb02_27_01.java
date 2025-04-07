package feb;

import java.util.ArrayList;

public class Feb02_27_01 {
	
//	문자열 배열 strArr가 주어집니다. 
//	배열 내의 문자열 중 "ad"라는 부분 문자열을 포함하고 있는 
//	모든 문자열을 제거하고 남은 문자열을 순서를 유지하여 배열로 
//	return 하는 solution 함수를 완성해 주세요.
			
	public String[] solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<String>();
        int a = 0;
        
        for(int i = 0; i<strArr.length; i++) {
        	
        	if(strArr[i].indexOf("ad") < 0) {
        		list.add(strArr[i]);
        	}
        	
        }
        
        String[] answer = new String[list.size()];
        
        for(int i=0; i<list.size();i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
			
			
			
			
}
