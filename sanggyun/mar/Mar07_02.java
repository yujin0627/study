package Mar;

import java.util.Arrays;

public class Mar07_02 {

//	문자열 배열 strArr이 주어집니다. 
//	strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때 가장 
//	개수가 많은 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.
	
	public int solution(String[] strArr) {
        int[] arr = new int[strArr.length];
        
        for(int i = 0; i< strArr.length; i++) {
        	arr[i] = strArr[i].length();
        }
        
        Arrays.sort(arr);
        
        int count = 0;
        int check = 0;
        int answer = 0;
        
        for(int i = 0; i<arr.length; i++) {
	        if(count == 0) {
	        	check = arr[i];
	        	count++;
	        } else if(check == arr[i]) { /// 1 1   
	        	count++;
	        } else { // 1 2
	        	answer = Math.max(answer, count);
        		count = 1;
        		check = arr[i];
        	}
        }
        
        answer = Math.max(answer, count);
        
        return answer;
    }

	
	
	
	
	
}





