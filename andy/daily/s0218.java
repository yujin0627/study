package studypresentation;

public class s0218 {

}

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int on = 0;
        int en = 0;
        
        for(int i = 0; i < num_list.length; i++) {
        	if(i % 2==1) {
        		on += num_list[i];
        	} else {
        		en += num_list[i];
        	}
        }
        
        if(on >= en) {
        	answer = on;
        } else {
        	answer = en;
        }
        
        return answer;
    }
}