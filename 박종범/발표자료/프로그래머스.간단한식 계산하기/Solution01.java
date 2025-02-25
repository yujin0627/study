package codingtest;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static int solution(String binomial) {
        String[] arr = binomial.split(" "); // [a,+,b]
        int a = Integer.parseInt(arr[0]); //"a + b"에서 앞자리 a
        int b = Integer.parseInt(arr[2]); //"a + b"에서 뒷자리 b
        String c = arr[1]; //"+"
        switch (c) {
		case "+":
			return a+b;			
		case "-":
			return a-b;				
		case "*":
			return a*b;		
		}
        return 0;
       
    }



    public static void main(String[] args) {
    	String binomial="1 + 2";
    	System.out.println(solution(binomial));
    }
}

   
    


	
		
		
	

	
	
	
	
