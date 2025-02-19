package studypresentation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class s0219 {

}

class Solution {
    public int solution(int n) {
        int answer = 0;
        String s1 = "";
        String s2 = n+s1;
        String[] arr = {};
        arr = s2.split("");
        for(int i = 0; i < arr.length; i++) {
        	answer += Integer.parseInt(arr[i]);
        }
      

        return answer;
    }
}