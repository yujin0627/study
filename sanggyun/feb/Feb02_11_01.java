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
        //최종 결과 배열이 어떻게 나올지 모르기 때문에 ArrayList 사용
        ArrayList<Integer> list = new ArrayList<>();
        
        
        for(int i = 0; i < arr.length; i++) { //ArrayList 에 배열 넣기
        	list.add(arr[i]);
        }
        
        for(int i = 0; i < query.length; i++) { //배열 전체 반복
        	//바뀐 결과값을 집어넣기 위한 추가 list2
        	//list 하나로 하면 내용물이 계속 바뀌어서 인덱스 값이 달라져 결과가 이상하게 나옴
        	ArrayList<Integer> list2 = new ArrayList<>();
        	
        	if(i%2 == 0) {//짝수 인덱스
        		for(int j = 0; j <= query[i]; j++) { //
        			list2.add(list.get(j));
        			
        			}
        		} else { //홀수 인덱스
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



//class Solution {
//    public int[] solution(int[] arr, int[] query) {
//        int start = 0;
//        int end = arr.length - 1;
//        for (int i = 0; i < query.length; i++) {
//            if (i % 2 == 0) {
//                end = start + query[i] - 1; 
//            } else {
//                start += query[i];
//            }
//        }
//		  
//		  Arrays.copyOfRange -> arr이란 배열에서 arr[앞의숫자]~arr[뒤의숫자]까지 떼어내서 배열화한다
//		  단, arr[end+2] 는 이 배열에 포함되지 않고 나타나는건 arr[end+1]까지다
//        return Arrays.copyOfRange(arr, start, end + 2);
//
//    }























