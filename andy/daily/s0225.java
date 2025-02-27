package studypresentation;

import java.util.List;
import java.util.ArrayList;

public class s0225 {

}

class Solution {
    public List<Long> solution(int x, int n) {
        List<Long> answer = new ArrayList<Long>();
        
        long d = (long)x;
        
        for(int i = 1; i <= n; i++) {
        	answer.add(d*i);
        }
        return answer;
    }
}