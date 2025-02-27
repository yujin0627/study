package studypresentation;

import java.util.List;
import java.util.ArrayList;

public class Maxandmin { //최댓값과 최솟값

}



class Solution {
    public String solution(String s) {
       
        String [] stringarr = {};
        
        stringarr = s.split(" ");
        
        int [] intarr = new int[stringarr.length];
        
        for(int i = 0; i < stringarr.length; i++) {
        	intarr[i] = Integer.parseInt(stringarr[i]);
        }
        
        int max = intarr[0];
        int min = intarr[0];
        
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
        
        
        
        
        
        return min + " " + max;
    }
}