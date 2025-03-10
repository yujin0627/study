package codingtest;

import java.util.*;

public class Solution3 {
    public static String solution(String s) {
    	//1개만 나온 글자저장
        Set<Character> uniqueChars = new HashSet<>();
        //여러개나온 글자저장
        Set<Character> duplicates = new HashSet<>();
        char[] arr=s.toCharArray();
        //중복 문자를 찾아서 Set에 추가
        for (char ch : arr) {
            if (uniqueChars.contains(ch)) {
                duplicates.add(ch);
            } else {
                uniqueChars.add(ch);
            }
        }
        System.out.println(uniqueChars.toString());
        System.out.println(duplicates.toString());
        
        // 중복된 문자는 제거
        // l이 한개가아닌 l,l두개 제거
        uniqueChars.removeAll(duplicates);
        
        System.out.println(uniqueChars.toString());
        //uniqueChars을 ArrayList로 변환한 후
        //set => list      
        System.out.println(uniqueChars.toString());
        List<Character> resultList = new ArrayList<>(uniqueChars);
        
        //문자들 사전 순으로 정렬
        Collections.sort(resultList);
        
        // 결과 반환
        StringBuilder result = new StringBuilder();
        for (char ch : resultList) {
            result.append(ch);
        }
        
        return result.toString();
    }
    

    public static void main(String[] args) {
    	String s="hello";
    	System.out.println(solution(s));
    			
    }
}
