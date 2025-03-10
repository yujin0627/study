package Mar;

import java.math.*;
import java.util.*;

public class Mar10_01 {

	public static BigInteger[] solution(int n, int m) {
		BigInteger[] answer = new BigInteger[2];
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
		
        for(int i = 1; i <= n; i++) {
        	if(n % i == 0) {
        		list1.add(i);
        	}
        }
        
        for(int i = 1; i <=m; i++) {
        	if(m % i == 0) {
        		list2.add(i);
        	}
        }
        
        Collections.sort(list1, Collections.reverseOrder());
        Collections.sort(list2, Collections.reverseOrder());
        
        Integer min = 0;
        
        x:for(int i = 0; i < list1.size(); i++) {
        	for(int j = 0; j < list2.size(); j++) {
        		if(list2.get(j).equals(list1.get(i))) {
        			min = list1.get(i);
        			break x;
        		}
        	}
        }
        
        BigInteger nBig = BigInteger.valueOf(n);
        BigInteger mBig = BigInteger.valueOf(m);
        BigInteger minBig = BigInteger.valueOf(min);
        
        BigInteger max = nBig.multiply(mBig).divide(minBig);
        
    	
    	answer[0] =minBig;
    	answer[1] =max;
        
        return answer;
    }
	
//	public static int[] solution(int n, int m) {
//		int[] answer = new int[2];
//        ArrayList<Integer> list1 = new ArrayList<>();
//        ArrayList<Integer> list2 = new ArrayList<>();
//		
//        for(int i = 1; i <= n; i++) {
//        	if(n % i == 0) {
//        		list1.add(i);
//        	}
//        }
//        
//        for(int i = 1; i <=m; i++) {
//        	if(m % i == 0) {
//        		list2.add(i);
//        	}
//        }
//        
//        Collections.sort(list1, Collections.reverseOrder());
//        Collections.sort(list2, Collections.reverseOrder());
//        
//        int min = 0;
//		  int max = 0;
//        
//        x:for(int i = 0; i < list1.size(); i++) {
//        	for(int j = 0; j < list2.size(); j++) {
//        		if(list2.get(j).equals(list1.get(i))) {
//        			min = list1.get(i);
//        			break x;
//        		}
//        	}
//        }
//        
//        max = (m * n) / min;
//        
//    	  answer[0] =min;
//    	  answer[1] =max;
//        
//        return answer;
//    }
	
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(999999, 1000000)));
		
	}
	
	
	
	
}
