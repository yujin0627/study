package feb;

import java.util.ArrayList;

//정수 배열 arr가 주어집니다. 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 return 하는 solution 함수를 완성해 주세요.
//
//단, arr에 2가 없는 경우 [-1]을 return 합니다.
//
//제한사항
//1 ≤ arr의 길이 ≤ 100,000
//1 ≤ arr의 원소 ≤ 10
//
//입출력 예
//arr	result
//[1, 2, 1, 4, 5, 2, 9]	[2, 1, 4, 5, 2]
//[1, 2, 1]	[2]
//[1, 1, 1]	[-1]
//[1, 2, 1, 2, 1, 10, 2, 1]	[2, 1, 2, 1, 10, 2]

class Solution {
    public int[] solution(int[] arr) {
    	//배열이 얼마나 늘어날지 모르니 추가가 용의한 arraylist배열 사용
        ArrayList<Integer> list = new ArrayList<>();
        //2가 아닌 숫자들을 추가하기 위한 방편
        boolean switch1 = false;
        
        //2의 갯수 세기
        int count = 0;
        
        for (int i = 0; i < arr.length; i++ ) {
        	if(arr[i] == 2) {
        		count++;
        	}
        }
        
        //배열에 추가하기
        if(count == 0) { //2의 숫자가 0개라면 배열에 2가 하나도 없다는 것
        	list.add(-1);
        } else if (count == 1) { // 2의 숫자가 1개라면 배열에 2가 하나만 있어서 추가되는 것도 2뿐
        	list.add(2);
        } else { // 2의 숫자가 여러개일때
        	for(int i = 0; i<arr.length; i++) {
        		if(count <= 0) { //2의 숫자를 세어봤는데 2의 숫자만큼 체크를 다했다면
        			break;
        		} else 
        			
        			
        			if(arr[i] == 2 && switch1 == false) { //첫번째 2라는 뜻
        			list.add(arr[i]);
        			count--; //2의 갯수 한개 줄이기
        			switch1 = true; // 첫번째 2 이기 때문에 그 이후에 나오는 숫자들도 배열에 추가해야함
        			
        			
        			
        			
        		} else if (arr[i] == 2 && switch1 == true) { //첫번째 이후의 2라는 뜻
        			list.add(arr[i]);
        			count--;//2의 갯수 한개 줄이기
        			
        			
        			
        			
        		} else if (switch1 == true) { //첫번째 2 이후의 다른 숫자(배열에 추가해야함)
        			list.add(arr[i]);
        		}
        	}
        }
        
        //arraylist 를 int[]로 변경
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}

// import java.util.*;
// class Solution {
//     public ArrayList<Integer> solution(int[] arr) {
//         ArrayList<Integer> answer = new ArrayList<Integer>();
//         
//         int start = -1;
//         int end = -1;
//         
//         for(int i = 0; i<arr.length; i++){
//             if(arr[i]==2){
//                 start = i;
//                 end = arr.length-i
//                 break;
//             }
//         }
//         for(int i = arr.length-1; i>=0; i--){
//             if(arr[i]==2){
//                 end = i;
//                 break;
//             }
//         }
//         
//         for(int i = start; i <=end; i++) {
//        	 
//         }
//         
//         if(start==-1 && end==-1){
//             answer.add(-1);
//         } else{
//             for(int i = start; i<=end; i++){
//                 answer.add(arr[i]);
//             }
//         }
//         return answer;
//     }
// }
