package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Codding_배열_만들기_4 {

	public static void main(String[] args) {

		Codding_배열_만들기_4 c = new Codding_배열_만들기_4();

		int[] arr = { 1, 4, 2, 5, 3 };

//		System.out.println(c.solution(arr)); 
		System.out.println(Arrays.toString(c.solution(arr)));
	}

	public int[] solution(int[] arr) {

		List<Integer> list = new ArrayList<Integer>();
		int[] stk = {};

		int i = 0;
		while (i < arr.length) {
			if (list.size() == 0) {
				list.add(arr[i]);
				i++;
			} else if (list.size() != 0 && list.get(list.size() - 1) < arr[i]) {
				list.add(arr[i]);
				i++;
			} else if (list.size() != 0 && list.get(list.size() - 1) >= arr[i]) {
				list.remove(list.size() - 1);
			}

		}
		stk = new int[list.size()];
	        for(int j = 0; j < list.size(); j++) {
	        	stk[j] = list.get(j);
	        }

		//list의 값이 j에 들어가고 j 가 인덱스 값이 되어 에러남
//		for (Integer j : list) {
//			stk[j] = list.get(j);
//			System.out.println(1);
//		}

//		System.out.println(Arrays.toString(stk));
//	        System.out.println(list.toString());

		return stk;
	}

	// 시간초과
//	public int[] solution(int[] arr) {
//
//		int[] stk = new int[1];
//		int i = 0;
//		while (i < arr.length) {
//
//			if (i == 0) {
//				stk[0] = arr[i];
//				i++;
//			} 
//			else if (stk.length != 0 && stk[stk.length - 1] < arr[i]) {
//				int[] temp = new int[stk.length];
//				
//				temp = stk;
//				
//				stk = new int[stk.length + 1];
//				
//				for(int l = 0; l < temp.length; l++) {
//					stk[l] = temp[l];
//				}
//				
////				stk[i] = arr[i];
//				stk[stk.length - 1] = arr[i];
//				i++;
//				
//			} 
//			else if (stk.length != 0 && stk[stk.length - 1] >= arr[i]) {
//				int[] temp = new int[stk.length - 1];
//
//				for (int j = 0; j < temp.length; j++) {
//					temp[j] = stk[j];
//					
//				}
//
//				stk = new int[temp.length];
//				stk = temp;
//			}
//		}
//		return stk;
//	}
}
