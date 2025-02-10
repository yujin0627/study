package codingtest;

import java.util.Scanner;

public class solution1 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String word=scan.next();	 //[zZa]
		
		
		//1.  모든 글자 대문자로 변환 [ZZA]		
		word=word.toUpperCase();  
		
		//2. 알파벳 등장 횟수 저장 
		
		int[] cnt=new int[26]; //[0,0,0]
		char[] cword=word.toCharArray(); //[Z,Z,A]
		
		for(char c : cword) {
			cnt[c-'A']++; // c=Z일때 cnt[90-65] 즉 cnt[15]=1 이됨
		}
		
		//3. 최댓값 찾기
		
		int max =0;
		char result='?';
		
		for(int i=0; i<26;i++) {
			
			if(cnt[i]>max) {
				max=cnt[i]; //만약 제일 많이나온숫자가 Z이다 => cnt[15]값이 제일 클것
				result=(char)(i+65);  //15숫자를 Z로 다시 바꾸기
			}else if(cnt[i]==max) {
				//Mississipi 처럼 S의갯수:4 I의갯수:4 일때				
				result='?';
			}
		}		
		System.out.println(result);
		
		
	}
		
}