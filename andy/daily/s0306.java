package studypresentation;

import java.util.List;
import java.util.ArrayList;

public class s0306 { //피자 나눠 먹기

}



class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n%7==0) {
        	answer = n / 7;
        } else if(n%7 < 7) {
        	answer = n/7 + 1;
        }
        return answer;
    }
}