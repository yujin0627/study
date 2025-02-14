package studypresentation;

public class s021401 {
	
	public static void main(String[] args) {
		
	}

}

class Solution {
    public String solution(int num) {
        String answer = "";
        if(num % 2 == 0) {
        	answer = "Even";
        } else {
        	answer = "Odd";
        }
        return answer;
    }
}