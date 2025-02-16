package codingtest;


class Solution {
    public static String solution(String rny_string) {
    	String[] arr=rny_string.split("");
    	for(int i =0; i<arr.length;i++) {
    		if(arr[i].equals("m")) {
    			arr[i]=arr[i].replace("m","rn");
    			    		}
    	}
    	String ans="";
    	for(int i=0; i<arr.length;i++) {
    		ans+=arr[i];
    	}
    	return ans;
    }



	       
	
	public static void main(String[] args) {
	
		String rny_string ="masterpiece";
		System.out.println(solution(rny_string));
	}
}

	


