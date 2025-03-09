package codingtest;



import java.util.*;

public class Solution {
    public static int solution(int n) {
        
    	String str= n+"";
    	String[] arr=str.split("");
    	int[] a=new int[arr.length];
    	for(int i=0;i<arr.length;i++) {
    		a[i]=Integer.parseInt(arr[i]);
    	}
    	int sum=0;
    	for(int i=0; i<arr.length;i++){
    		sum+=a[i];
    	}
    	return sum;
    }


   
    public static void main(String[] args) {
    	int n= 123;
    	System.out.println(solution(n));
    }
		

}


	 
    


	

