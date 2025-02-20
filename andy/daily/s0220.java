package studypresentation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class s0220 {

}

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a==b) {
        	return (long)a;
        }
        long min = 0;
        long max = 0;
        if(a>b) {
        	max = (long)a;
        	min = (long)b;
        } else {
        	max = (long)b;
        	min = (long)a;
        }
        
        
        
        return ((max - min +1) * (min + max) / 2 );
        
    }
}