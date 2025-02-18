package studypresentation;

public class AnotherHandling {

	
	
}

class Solution2 {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder(); //문자를 변경할때마다 기존 객체를 계속 재활용(재사용)
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            char current = code.charAt(i); // code 문자열을 하나하나 쪼개 처음부터 훑는다.
            if (current == '1') { //훑다가 1이 나오면 
                mode = mode == 0 ? 1 : 0; // 삼항연산식. [조건식 ? 연산식1 : 연산식2] 조건의 결과가 참이면 연산식1, 거짓이면 연산식2를 실행
                //모드 최초값은 0, 모드가 0이 참이므로 모드를 1로 바꾼다.
                continue; //모드를 변경하고 현재 반복을 종료. 다음 반복으로 바로 넘어가게 한다.
            }

            if (i % 2 == mode) { // 초기 mode값 0. 그러므로 짝수값만 추가. 모드가 바뀌면 홀수값만 추가. 
                answer.append(current); //스트링빌더과 같이 사용. 객체의 끝에 문자열을 추가
            }
        }
        return answer.length() == 0 ? "EMPTY" : answer.toString();
    }	//answer이라는 스트링 빌더에 저장되어 있는 객체를 문제에서 요구하는 String타입으로 반환하기 위해 사용하는 메서드
}
