package feb;

import java.util.ArrayList;

public class Feb02_27_04 {

//	문자열 myString이 주어집니다. 
//	myString을 문자 "x"를 기준으로 나눴을 때 
//	나눠진 문자열 각각의 길이를 순서대로 저장한 
//	배열을 return 하는 solution 함수를 완성해 주세요.
	
	public int[] solution(String myString) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        String[] arr2 = myString.split("");
        String[] arr = myString.split("x");
        
        for(int i = 0; i<arr.length; i++) {
        	
        	list.add(arr[i].length());
        }
        
        if(arr2[arr2.length-1].equals("x")) {
        	list.add(0);
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i< list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
	
}
