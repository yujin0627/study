package studypresentation;

public class CodeHandling {  //코드 처리하기
	
	public static void main(String[] args) {
		
	}

}

class Solution {
    public String solution(String code) {
        String answer = "";
        String ret = "";


        char[] arr = code.toCharArray(); // 주어지는 code를 char형으로 한글자씩 잘라 배열로 저장

        int mode = 0; //초기값은 0으로 설정



        for (int i = 0; i < arr.length; i++) { //code 배열을 싹 훑는다

            if(mode == 0) { //mode가 0일 때

                if(arr[i] == '1') { //모드 1로 변경
                    mode = 1;



                } else if(arr[i] != '1') { //모드 0 기능
                    if(i % 2 == 0 | i == 0) {
                        ret += arr[i];

                    }
                }

            } else if(mode == 1) { //mode가 1일 때

                if(arr[i] == '1') { //모드 0으로 변경
                    mode = 0;



                } else if(arr[i] != '1') { //모드 1 기능
                    if(i % 2 == 1) {
                        ret += arr[i];

                    }
                }

            }

        }

        if(ret == "") {
            answer = "EMPTY";
        } else {
            answer = ret;
        }
        return answer;
    }
}