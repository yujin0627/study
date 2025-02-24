package feb;

public class Feb02_18_01 {

//	정수 배열 arr가 주어집니다. 
//	arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 
//	2로 나누고, 50보다 작은 홀수라면 2를 곱하고 다시 1을 더합니다.
//
//	이러한 작업을 x번 반복한 결과인 배열을 arr(x)라고 표현했을 때, 
//	arr(x) = arr(x + 1)인 x가 항상 존재합니다. 
//	이러한 x 중 가장 작은 값을 return 하는 solution 함수를 
//	완성해 주세요.
//
//	단, 두 배열에 대한 "="는 두 배열의 크기가 서로 같으며, 
//	같은 인덱스의 원소가 각각 서로 같음을 의미합니다.
	
//	public int solution(int[] arr) {
//        int answer = 0;
//        int[] arr2 = new int[arr.length];
//        
//        for(int i = 0; i < arr.length; i++) {
//        	arr2[i] = arr[i];
//        }
//        
//        int count = 0;
//        int i = 0;
//        
//        x:while(i<arr.length) {
//        	if (arr2[i]>=50 && arr2[i]%2==0) {
//        		arr2[i] = arr2[i] / 2;
//        	} else if (arr2[i] < 50 && arr2[i]%2==1) {
//        		arr2[i] = arr2[i]*2+1;
//        	}
//        	i++;
//        }	
//        	        	
//    	if(arr2 == arr) {
//			answer = count;
//    	} else {
//    		count++;
//    	}
//		
//        return answer;
//    }
	
	
	public int solution(int[] arr) {
        int answer = 0; //반복횟수
        
        while(true) {
        	boolean check = false; //arr(x) = arr(x+1) 을 검증하기 위한 장치
    	   
        	for(int j = 0; j<arr.length; j++) { //조건식 반복
        		int a = arr[j]; //arr(x)
        		
	        	if (arr[j]>=50 && arr[j]%2==0) { //arr(x+1)
	        		arr[j] = arr[j] / 2;
	        	} else if (arr[j] < 50 && arr[j]%2==1) {
	        		arr[j] = arr[j]*2+1;
	        	}
	        	
	        	if(arr[j] != a) { //같지 않다는 건 arr(x) != arr(x+1)
	        		check = true;
	        	}
        	}
        	
        	if(!check) { //기본이 false, 값이 바뀌면 true가 되서 !check가 false, 다시 반복
        		break;
        	}
        	answer++; // 반복 카운트 증가
        }
	        
        return answer;
    }
	
	
	
	
	
}
