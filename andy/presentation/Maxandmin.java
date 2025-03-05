package studypresentation;

import java.util.List;
import java.util.ArrayList;

public class Maxandmin { //최댓값과 최솟값

}



class Solution {
    public String solution(String s) { //s는 공백으로 구분된 문자열
       
        String [] stringarr = {}; //split으로 반환 받을 배열 선언
        
        stringarr = s.split(" ");
        
        int [] intarr = new int[stringarr.length]; //int 타입의 배열도 선언
        
        for(int i = 0; i < stringarr.length; i++) { 
        	intarr[i] = Integer.parseInt(stringarr[i]); //배열 옮겨담고
        }
        
        int max = intarr[0];
        int min = intarr[0]; //최대 최소의 초기값 설정
        
        for(int i = 0; i < intarr.length; i++) { //Max 스캔
        	if(max <= intarr[i]) {
        		max = intarr[i];
        	}
        }
        
        for(int i = 0; i < intarr.length; i++) { //min 스캔
        	if(min >= intarr[i]) {
        		min = intarr[i];
        	}
        }
        
        
        // int 배열에 Arrays.sort를 사용하면 빠른 오름차순 정렬이된다
        // return intarr[0] + " " + intarr[intarr.length-1];
        
        
        return min + " " + max; //문자열로 반환해야하므로 공백 문자열 " "를 더함
    }
}