package codingtest;

class Solution {
    public  double solution(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++) {
        	sum+=arr[i];
        }
        return sum/arr.length;
    }



   
    public static void main(String[] args) {
    	int n= 123;
    	System.out.println(solution(n));
    }
		

}


	 
    


	

