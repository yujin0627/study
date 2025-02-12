package feb;

import java.util.ArrayList;

public class Feb02_12_03 {

//	문자열 리스트 str_list에는 "u", "d", "l", "r" 네 개의 문자열이 여러 개 
//	저장되어 있습니다. str_list에서 "l"과 "r" 중 먼저 나오는 문자열이 "l"이라면 
//	해당 문자열을 기준으로 왼쪽에 있는 문자열들을 순서대로 담은 리스트를, 먼저 나오는
//	문자열이 "r"이라면 해당 문자열을 기준으로 오른쪽에 있는 문자열들을 순서대로 담은 
//	리스트를 return하도록 solution 함수를 완성해주세요. "l"이나 "r"이 없다면 빈 
//	리스트를 return합니다.
	
	public String[] solution(String[] str_list) {
        ArrayList<String> list = new ArrayList<>();
        
        int a = 0;
        int b = 0;
        
        for(int i =0; i < str_list.length; i++) {
        	if(str_list[i].equals("l")) { // u l / i=1
        		a = i;
        		b = 1;
        		break;
        	} else if (str_list[i].equals("r")) {// u r / i=1
        		a = i;
        		b = 2;
        		break;
        	}
        }
	
        if(b==0) {
        	return new String[] {};
        } else if(b==1) {
        	for(int i = 0; i < a; i++) {
        		list.add(str_list[i]);
        	}
        } else if(b==2) {
        	for(int i = a+1; i < str_list.length; i++) {
        		list.add(str_list[i]);
        	}
        }
        
       
        String[] answer = new String[list.size()]; 
        
        for(int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }
        return answer;
        
	}
}
