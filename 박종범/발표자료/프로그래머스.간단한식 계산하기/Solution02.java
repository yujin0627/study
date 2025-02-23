package codingtest;

import java.util.ArrayList;
import java.util.List;

class Solution02 {
    public static int solution(String binomial) {
    	//입력이 "1 + 2"가 아닌 "1+2"라고 생각해보자
    	String[] op= {"+","-","*"};    	
    	String findop="";
    	for(int i=0;i<op.length;i++) {
    		if(binomial.contains(op[i])) {
    			findop=op[i]; //찾은 연산자 저장 + 저장해놔
    		}    		
    	}
    	//"a+b"를 +기준으로 나누기
//    	String[] arr=binomial.split(op[i]);
//    	String[] arr=binomial.split(+); 이거 안됨..... 
    	
    	//+는 정규표현식에서 "1개 이상"을 의미하는 메타 문자이므로, 
    	//split("+")를 그대로 사용하면 오류가 발생합니다.
    	
    	String[] ans=binomial.split("\\"+findop);
    	int a=Integer.parseInt(ans[0]);
    	int b=Integer.parseInt(ans[1]);
    	
    	switch (findop) {
		case "+":
			return a+b;
		case "-":
			return a-b;
		case "*":
			return a*b;
		}
    	return 0;
    	
    }






    public static void main(String[] args) {
    	String binomial="2+1";
    	System.out.println(solution(binomial));
    }
}

   
    


	
		
		
	

	
	
	
	
