package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

//내가푼풀이
import java.util.*;

public class Solution2 {
    public static String solution(String s) {
        int[] count = new int[26]; // 'a'부터 'z'까지의 문자 수를 세기 위한 배열
        
        // 문자열에서 각 문자의 등장 횟수 세기
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }
        
        // 등장 횟수가 1인 문자만 추출
        List<Character> uniqueChars = new ArrayList<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (count[ch - 'a'] == 1) {
                uniqueChars.add(ch);
            }
        }
        
        // 문자들 사전 순으로 정렬 (이미 'a'부터 'z'까지 확인하므로 정렬 필요 없음)
        StringBuilder result = new StringBuilder();
        for (char ch : uniqueChars) {
            result.append(ch);
        }
        
        return result.toString();
    }

   



    public static void main(String[] args) {
    	String s="hello";
    	System.out.println(solution(s));
    			
    }
}

   
    


	
		
		
	

	
	
	
	
