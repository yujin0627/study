package studypresentation;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class s0307 { //피자 나눠 먹기

}



class Solution {
    public List<Integer> solution(int n, int[] numlist) {
       List<Integer> answer = new ArrayList<Integer>();
        for(int a : numlist) {
        	if(a % n == 0) {
        		answer.add(a);
        	}
        }
        return answer;
    }
}