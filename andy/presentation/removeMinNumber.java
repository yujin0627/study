package studypresentation;

import java.util.List;
import java.util.ArrayList;

public class removeMinNumber { //제일 작은 수 제거하기

}

class Solution {
    public int[] solution(int[] arr) {

        if(arr.length == 1) { //애초에 배열의 길이가 1이면 무조건 -1 반환
            return new int[]{-1};
        }

        List<Integer> list = new ArrayList<>(); //편하게 하려고 리스트 선언

        for(int i = 0; i < arr.length; i++) { // 배열을 리스트에 옮겨 담기
            list.add(arr[i]);
        }

        int min = list.get(0); // 리스트의 첫번째 인덱스 값을 최솟값으로 초기값 지정

        for(int i = 1; i < list.size(); i++) { //리스트 전체를 훑으면서
            if(min > list.get(i)) {
                min = list.get(i); //값을 비교해서 최솟값을 결정
            }
        }

        //remove가 소괄호 안의 매개변수로 !!int index와 Object를 받을 수 있다.
        
        //list.remove(min); //이 경우 remove는 인덱스를 참조하는 메서드가 실행되기에 오류 발생
        list.remove(Integer.valueOf(min)); //remove는 Object 메서드를 호출한다
        //Integer.valueOf()는 매개변수(int타입 or String타입) 값을 Integer타입으로 변환해주는 메서드.
        //remove의 매개변수가 Integer타입이 되었으므로 인덱스가 아닌 해당 값 자체를 리스트에서 삭제한다.
        
        int[] answer = new int[list.size()]; //배열로 반환해야하니까

        for(int i = 0; i < list.size(); i++) { //정답 제출용 배열로 옮겨담기
            answer[i] = list.get(i);
        }

        return answer;
    }
}