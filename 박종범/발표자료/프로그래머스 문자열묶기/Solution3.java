package codingtest;

class Solution3 {
    public static int solution(String[] strArr) {
        int answer = 0;

        int[] lengArr = new int[31];

        for(int i=0; i<strArr.length; i++) {
            lengArr[strArr[i].length()]++;
        }

        for(int i=0; i<=30; i++) {
            answer = Math.max(answer, lengArr[i]);
        }

        return answer;
    }
    public static void main(String[] args) {
    	String[] strArr=new String[] {"a","bc","d","efg","hi"};
    	System.out.println(solution(strArr));
    	
    }
		
}