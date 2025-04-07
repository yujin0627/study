package codingtest;

class Solution {
    public static int solution(String[] order) {
    	int[] arr=new int[order.length];
    	for(int i=0;i<order.length;i++) {
        	if(order[i].contains("americano")) {
        		arr[i]=4500;
        	}else if(order[i].contains("cafelatte")) {
        		arr[i]=5000;
        	}else if(order[i].equals("anything")) {
        		arr[i]=4500;
        	}
        }
        int sum=0;
        for(int i=0;i<order.length;i++) {
        	sum+=arr[i];
        }
        
        
        return sum;
    }

	 
    
	       
	
	public static void main(String[] args) {
		
		String[] order= {"americanoice", "americano", "iceamericano"};
		System.out.println(solution(order));
	}
    
}

	


