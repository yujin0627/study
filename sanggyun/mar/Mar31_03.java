package Mar;

import java.math.BigInteger;

public class Mar31_03 {

//	0 이상의 두 정수가 문자열 a, b로 주어질 때, 
//	a + b의 값을 문자열로 return 하는 solution 함수를 작성해 주세요.
	
	public String solution(String a, String b) {
        String answer = "";
        
        BigInteger aa = new BigInteger(a);
        BigInteger bb = new BigInteger(b);
        
        BigInteger cc = aa.add(bb);
        
        answer = cc.toString();
        
        return answer;
    }
}