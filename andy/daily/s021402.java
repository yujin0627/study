package studypresentation;

public class s021402 {
	
	public static void main(String[] args) {
		
	}

}

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for(int i = 0; i < arr.length; i++) {
        	answer += arr[i];
        }
        return answer/arr.length;
    }
}