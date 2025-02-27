package feb;

import java.util.ArrayList;

public class Feb02_27_03 {

//	단어가 공백 한 개 이상으로 구분되어 있는 문자열
//	my_string이 매개변수로 주어질 때, my_string에
//	나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 
//	return 하는 solution 함수를 작성해 주세요.
	
	public String[] solution(String my_string) {
		
		ArrayList<String> list = new ArrayList<String>();
		
        String[] a = my_string.split("\\s+");
        //스플릿을 쓸때 " "(공백)으로 자르면 연속된 공백은 다 잘린다
        
        for(int i = 0; i<a.length; i++) {
        	
        	if(!a[i].equals("")) {
        		list.add(a[i]);
        	}	
        }
        
        String[] answer = new String[list.size()];
        
        for(int i = 0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
	
	
}
