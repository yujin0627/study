package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public static int[] solution(long n) {
        
        
        StringBuilder sb = new StringBuilder(n+"");
        
        String[] str=sb.reverse().toString().split("");
        int[] answer=new int[str.length];
        for(int i=0; i<str.length;i++) {
        	answer[i]=Integer.parseInt(str[i]);
        }
        
        
        
        return answer;
    }
        
    



	 
    
	       
	
	public static void main(String[] args) {
		
		long n =12345;
		System.out.println(Arrays.toString(solution(n)));
	}
    
}

	


