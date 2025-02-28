package feb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Feb02_28_01 {
	
//	문자열 myString이 주어집니다. 
//	"x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후 
//	사전순으로 정렬한 배열을 return 하는 solution 함수를 완성해 주세요.
//
//	단, 빈 문자열은 반환할 배열에 넣지 않습니다.
	
	public static String[] solution(String myString) {
        
		ArrayList<String> list = new ArrayList<String>();
		String str = "";
		String[] arr = myString.split("");
		
		for(int i = 0; i<myString.length(); i++) {
			
			if(arr[i].equals("x")) {
				arr[i]= " ";
			}
		}
		if(!arr[0].equals(" ")) {
			str = String.join("", arr);
		} else {
			for(int i = 1; i<arr.length; i++) {
				str += arr[i];
			}
		}
		String[] arr2 = str.split("\\s+");
		
		for(int i = 0; i < arr2.length; i++) {
			list.add(arr2[i]);
		}
		
		Collections.sort(list);
		//오름차순 정렬
		//Collections.sort(list, Collections.reverseOrder())
		//내림차순 정렬
		
		String[] answer = new String[list.size()];
		
		for(int i=0; i< list.size(); i++) {
			answer[i] = list.get(i);
			
		}
        return answer;
    }
	
	public static void main(String[] args) {
		
		String str = "xaxbxcx";
		
		solution(str);
		
		String[] arr2 = str.split("x");
		
		System.out.println(Arrays.toString(solution(str)));
		
	}
	
	
	
}
