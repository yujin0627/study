package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static int solution(String t, String p) {
    	
    	/*
    	 * 1. int의 한계:

			int의 최대값은 2,147,483,647 (10자리)입니다.
			
			p가 10자리를 넘으면 Integer.parseInt(p)에서 오류가 발생합니다.
			
			long으로의 수정 필요:
			
			long은 최대 9,223,372,036,854,775,807 (19자리)까지 처리 가능하므로, 
			p의 최대 길이인 18자리를 안전하게 처리할 수 있습니다.
			
			2. String 조회할떄 substring을 쓰자..
			3. 반복문에서 끝에대한 생각
			4. big integer사용법
			
			
    	 */
    	
        Long P= Long.parseLong(p); //271
        int plen=p.length(); //3

        String sum="";        
        int count=0;
        
        for(int i=0;i<=t.length()-plen;i++) {
  
        	sum=t.substring(i,i+plen);
        	Long a= Long.parseLong(sum);
        	
        	if(a<=P) {
        		count++;
        		
        	}
        }      
        
        return count;	
        
    }
    

    
	       
	
	public static void main(String[] args) {
		
		String t="500220839878";
		String p="7";	
		System.out.println("답:"+solution(t,p));
	}
    
}

	


