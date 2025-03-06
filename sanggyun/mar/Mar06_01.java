package Mar;

public class Mar06_01 {

//	정수 배열 arr이 매개변수로 주어집니다. 
//	arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 
//	정수 0을 추가하려고 합니다. arr에 최소한의 개수로 
//	0을 추가한 배열을 return 하는 solution 함수를 
//	작성해 주세요.
	
	public static int[] solution(int[] arr) {        
        int i = 2;
        
        while(true) {
        	if(i/2 == arr.length) {
        		i = i/2;
        		break;
        	}
        	
        	if(i == arr.length) {
        		break;
        	}
        	
        	if(i/2 < arr.length && arr.length < i) {
        		break;
        	}
        	
        	i *= 2;
        	
        }
       
        int[] answer = new int[i];
        
        for(int j = 0; j<arr.length; j++) {
    		answer[j] = arr[j];
    	}
        
        if(arr.length != i) {
        	for(int j = arr.length; j<i; j++) {
        		answer[j] = 0;
        	}
        } 
       
        return answer;
    }
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6,7,8,9};	
		int[] arr2 = {58, 172, 746, 89};	
		
		System.out.println((solution(arr)));
		
		
		
	}
	
}



