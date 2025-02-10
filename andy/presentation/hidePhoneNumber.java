package studypresentation;

import java.util.ArrayList;
import java.util.List;

public class hidePhoneNumber { //핸드폰 번호 가리기

}

class Solution {
    public String solution(String phone_number) {
        
    	String answer = "";
        
    	String[] arr = new String[phone_number.length()]; // split으로 쪼개진 핸드폰 번호를 받을 배열
        
    	List<String> list = new ArrayList<>();
        
    	arr = phone_number.split(""); //주어진 폰넘버를 하나하나 쪼개서 배열 arr에 담기
        
    	for(int i = 0; i < phone_number.length(); i++) {
        	list.add(arr[i]); // 배열 arr에 담긴 것을 그대로 list에 옮겨담기
        }
        
        //012345678910      인덱스번호
        //01033334444       예제폰번호
        
    	
        for(int i = 0; i < list.size()-4; i++) { // 뒷 네자리만 제외하고 전부 바꾸기
        	list.set(i, "*");
        }
        
        for(int i = 0; i < list.size(); i++) { //반환은 스트링 타입으로 해야하니까
        	answer += list.get(i);
        }
       
        return answer;
        //return String.valueOf(); int long float double boolean char char[]
       
    }
}