package feb;

import java.util.ArrayList;

public class Feb02_11_01 {

//	문제 설명
//	정수 배열 arr와 query가 주어집니다.
//
//	query를 순회하면서 다음 작업을 반복합니다.
//
//	짝수 인덱스에서는 arr에서 query[i]번 인덱스를 제외하고 배열의 query[i]번 인덱스 뒷부분을 잘라서 버립니다.
//	홀수 인덱스에서는 arr에서 query[i]번 인덱스는 제외하고 배열의 query[i]번 인덱스 앞부분을 잘라서 버립니다.
//	위 작업을 마친 후 남은 arr의 부분 배열을 return 하는 solution 함수를 완성해 주세요.
//	
	
	    public int[] solution(int[]arr, int[] query) {
	        
	        ArrayList<Integer> list = new ArrayList<>();
	        
	        
	        for(int i = 0; i < arr.length; i++) {
	        	list.add(arr[i]);
	        }
	        
	        for(int i = 0; i < query.length; i++) {
	        	ArrayList<Integer> list2 = new ArrayList<>();
	        	
	        	if(i%2 == 0) {
	        		for(int j = 0; j <= query[i]; j++) {
	        			list2.add(list.get(j));
	        			
	        			}
	        		} else {
	        			for(int j = query[i]; j < list.size(); j++) {
	        				list2.add(list.get(j));
	        				
	        			}
	        		}
	        	
	        	list = list2;
	        	
	        	}
	        	
        	int[] answer = new int[list.size()];
        
        	for (int i = 0; i < list.size(); i++) {
        		answer[i] = list.get(i);
        	}
	        return answer;
	    }
}














//String str = "";
//
//for(int i = 0; i < arr.length; i++) {
//	str += arr[i];
//}
//
//for(int i = 0; i < query.length; i++ ) {
//	if(query[i]+1 == query.length) {
//	
//	} else if(i%2 == 0) {
//		str = str.substring(0, query[i]+1);
//	} else {
//		str = str.substring(query[i]);
//	}
//}
//
//String[] str2 = str.split("");
//
//for(int i = 0; i < str2.length; i++) {
//	answer[i] = Integer.parseInt(str2[i]);
//}










