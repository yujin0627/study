package programmers;

import java.util.Arrays;

public class Codding_주사위_게임3 {

	public static void main(String[] args) {

		Codding_주사위_게임3 c = new Codding_주사위_게임3();

		c.solution(1, 5, 4, 1);

//		 String str = "To be, or not to be, that is the question.";
//			int count = 0;
//			int pos = str.indexOf("be");
//			while(pos > -1) {
//				count++;
//				pos = str.indexOf("be", pos + 1);
//			}
//			System.out.println(count); // 2
	}

//	public int solution(int a, int b, int c, int d) {
//		int answer = 0;
//
//		int[] arr = { a, b, c, d };
//		int count = 0;
//		String str = "";
//	
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i; j < arr.length; j++) {
//			
//					int pos = str.indexOf("be");
//					while(pos > -1) {
//						count++;
//						pos = str.indexOf("be", pos + 1);
//					}
//					System.out.println();
//				if (arr[j] == a) { //모두 같은 숫자면 count 4
//					count++;
//				}
//				else if(arr[i] == arr[i+1] ) {
//					
//				}
//
////				System.out.println(Arrays.toString(arr));
//				System.out.println(count);
//			}
//			
//			if(count == 4) {
//				answer = 1111 * a;
//				break;
//			}
//			
//			
//			
//		}
//
//		return answer;
//	}

	public int solution(int a, int b, int c, int d) {
		int[] dice = { a, b, c, d };
		Arrays.sort(dice);

		// 네 주사위 숫자가 모두 같을 때
		if (dice[0] == dice[3]) {
			return 1111 * dice[0];
		}
		// 세 주사위 숫자가 같고, 나머지 하나가 다를 때
		else if (dice[0] == dice[2]) {
			return (10 * dice[0] + dice[3]) * (10 * dice[0] + dice[3]);
		} else if (dice[1] == dice[3]) {
			return (10 * dice[1] + dice[0]) * (10 * dice[1] + dice[0]);
		}
		// 두 개씩 같은 숫자가 나올 때
		else if (dice[0] == dice[1] && dice[2] == dice[3]) {
			return (dice[0] + dice[2]) * Math.abs(dice[0] - dice[2]); //절대값
		}
		// 두 주사위 숫자가 같고, 나머지 두 주사위 숫자가 각각 다를 때
		else if (dice[0] == dice[1] || dice[1] == dice[2] || dice[2] == dice[3]) {
			if (dice[0] == dice[1]) {
				return dice[2] * dice[3];
			} else if (dice[1] == dice[2]) {
				return dice[0] * dice[3];
			} else {
				return dice[0] * dice[1];
			}
		}
		// 네 주사위 숫자가 모두 다를 때
		else {
			return dice[0];
		}
	}

}
