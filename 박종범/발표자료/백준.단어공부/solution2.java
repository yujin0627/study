package codingtest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class solution2 {
	public static void main(String[] args) {
		
		//"apple banana Apple orange banana apple Orange ORANGE apple"
		
		
		
		
		
		Scanner scan=new Scanner(System.in);
		String word=scan.nextLine();	 //[zZa]
		
		
		//1.  모든 글자 대문자로 변환 [ZZA]		
		word=word.toUpperCase();  
		
		//2. 해당 알파벳에 갯수 세기
		
		String[] wordarr= word.split("");
		
		Map<String, Integer> map= new HashMap<String, Integer>();   // Z=2 형태로
		
		
		for(int i=0; i<wordarr.length; i++) {
			//map.put(wordarr[i], 갯수);
			
			//갯수를 세는 방법-> map.getOrDefault -> 키가 존재하면 해당 값을 반환하고, 없으면 기본값을 반환한다
			// map.getOrDefault(wordarr[i], 0)+1;
			
			map.put(wordarr[i], map.getOrDefault(wordarr[i], 0)+1);
			// Z를 하면 map.put(Z, map.getOrDefault(Z, 0)+1) 
			//map.put(Z, 0+1) 즉 Z=1이 됨
						
		}
		
		System.out.println(map.toString());
		
		//3. 가장큰값에 해당하는 알파벳 찾기
		int max =0;
		String ans="";
		Set<String> keyset =map.keySet();
		for(String a :keyset) {
			
			if(max<map.get(a)) {
				max=map.get(a);	
				ans=a;
				
				
			}else if(max==map.get(a)) {
				ans="?";
			}			
		}
		System.out.println(ans);
	}
		
}

