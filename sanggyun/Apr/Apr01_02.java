package Apr;

import java.util.ArrayList;

public class Apr01_02 {

//	정수 배열 arr과 delete_list가 있습니다. 
//	arr의 원소 중 delete_list의 원소를 모두 삭제하고 남은 
//	원소들은 기존의 arr에 있던 순서를 유지한 배열을 return 하는 
//	solution 함수를 작성해 주세요.
	
	public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
        	list.add(arr[i]);
        }
        
        for(int i = 0; i < delete_list.length; i++) {
        	list2.add(delete_list[i]);
        }
        
        for(int i = 0; i< list.size(); i++) {
        	boolean check = false;
        	
        	for(int j = 0; j<list2.size(); j++) {
        		if(list.get(i).equals(list2.get(j))) {
        			check = true;
        			break;
        		}
        	}
        	
        	if(!check) {
        		list3.add(list.get(i));
        	}
        	
        }
        
        int[] answer = new int[list3.size()];

        for(int i =0; i<answer.length; i++) {
        	answer[i] = list3.get(i);
        }
        
        return answer;
    }
	
	
	
}


//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Set;
//
//public class Mar01_02 {
//    public int[] solution(int[] arr, int[] delete_list) {
//        // delete_list를 빠르게 검색할 수 있도록 Set으로 변환
//        Set<Integer> deleteSet = new HashSet<>();
//        for (int num : delete_list) {
//            deleteSet.add(num);
//        }
//        
//        // 결과를 담을 ArrayList
//        ArrayList<Integer> resultList = new ArrayList<>();
//        
//        // arr의 원소 중 delete_list에 없는 값만 resultList에 추가
//        for (int num : arr) {
//            if (!deleteSet.contains(num)) {
//                resultList.add(num);
//            }
//        }
//        
//        // 결과를 배열로 변환
//        int[] answer = new int[resultList.size()];
//        for (int i = 0; i < resultList.size(); i++) {
//            answer[i] = resultList.get(i);
//        }
//        
//        return answer;
//    }
//    






//1. delete_list를 빠르게 검색할 수 있도록 Set으로 변환
//java
//복사
//Set<Integer> deleteSet = new HashSet<>();
//for (int num : delete_list) {
//    deleteSet.add(num);
//}
//목적: delete_list에서 제거할 숫자들을 Set에 저장하여, 나중에 배열 arr에서 해당 숫자들이 delete_list에 포함되어 있는지 빠르게 확인할 수 있도록 합니다.
//
//HashSet: Set은 집합 자료구조로, 중복을 허용하지 않으며 내부적으로 빠른 검색 기능을 제공합니다. HashSet은 검색, 삽입, 삭제가 평균적으로 **O(1)**의 시간 복잡도를 가집니다.
//
//이 코드에서는 delete_list의 모든 원소를 deleteSet에 넣고 있습니다. 이를 통해, 나중에 deleteSet.contains(num)으로 해당 숫자가 delete_list에 포함되어 있는지를 빠르게 확인할 수 있습니다.
//
//2. 결과를 담을 ArrayList 생성
//java
//복사
//ArrayList<Integer> resultList = new ArrayList<>();
//목적: 결과 배열을 담을 리스트인 resultList를 생성합니다. resultList는 arr 배열에서 delete_list에 포함되지 않은 값들만 순서대로 저장할 것입니다.
//
//3. arr의 원소 중 delete_list에 없는 값만 resultList에 추가
//java
//복사
//for (int num : arr) {
//    if (!deleteSet.contains(num)) {
//        resultList.add(num);
//    }
//}
//이 부분은 배열 arr의 각 원소를 순차적으로 검사하여, 그 값이 delete_list에 포함되지 않으면 resultList에 추가하는 작업을 합니다.
//
//deleteSet.contains(num):
//
//num이 deleteSet에 포함되어 있으면 true를 반환하고, 포함되지 않으면 false를 반환합니다.
//
//delete_list에 포함되지 않은 값만 resultList에 추가됩니다.
//
//이 방식은 배열을 순차적으로 한 번만 순회하며, 각 원소에 대해 삭제 여부를 빠르게 확인할 수 있기 때문에 효율적입니다.

