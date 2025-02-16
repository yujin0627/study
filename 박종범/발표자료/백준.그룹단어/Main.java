package codingtest;


import java.util.Scanner;

public class Main {

/*
 * 1. N 입력 받기
   2. 반복문 (N번 실행)
      단어 입력 받기
      boolean[26] 배열 생성 (해당알파벳 방문 여부 체크)
      prev = ' ' (이전 알파벳 초기화)
      isGroupWord = true (초기값)
      for (각 문자 c 순회)
         -> prev != c (새로운 알파벳가 나오면)
            => if (visited[c - 'a'] == true) → 그룹 단어 X (isGroupWord = false, break)
             ==> visited[c - 'a'] = true (첫 등장 기록)
         ->prev = c (이전 알파벳 갱신)
      그룹 단어면 count++
   3. count 출력
 * 
 * 
 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N= scan.nextInt(); //1. N번 입력받음
		int count=0;
		
		for(int i=0; i<N;i++) { //반복문 (N번 문자를 받는다) 
			
			String word=scan.next(); //단어 입력 받기 //aaba
			char[] Cword=word.toCharArray(); //[a,a,b,a]
			char prev=' '; //이전 알파벳 초기화
			boolean[] check = new boolean[26]; //죄다 false로 초기화
			boolean isgroupword =true; //해당 word를 그룹단어로 선택되면 count++(갯수세기)하기 위한장치
			
			for(char c : Cword) { //이 반복문에서의 포인트는 이전알파벳 와 현재알페벳이 같니 아니니
				if(prev != c) {// 새로운 알파벳등장
					if(check[c-'a']) { //혹시 현재알파벳이 예전에 등장한적이 있니?
						 isgroupword=false; //등장한 적이 있다 -> 그룹단어아님
						 break;
						}
					check[c-'a']=true; 	// 체크리스트에 첫등장여부를 기록													
				}	
				prev =c;  //이전알파벳 갱신
			}
			
			if(isgroupword) {
				count++;
			}
				
		}
		System.out.println(count);	
}
}
