package codingtest;


public class Main {		
		public static void main(String[] args) {
			
			

			System.out.println([a-z]);
			
		}
	}
class Solution {
    public int solution(int[] arr1, int[] arr2) {
      if(arr1.length<arr2.length) {
    	  return -1;
      }else if(arr1.length==arr2.length) {
    	  int sum1=0;
    	  int sum2=0;
    	  for(int i=0;i<arr1.length;i++) {
    		  sum1+=arr1[i];
    	  }
    	  for(int i=0;i<arr2.length;i++) {
    		  sum2+=arr2[i];
    	  }
    	  if(sum1==sum2) {
    		  return 0;
     	  }else if(sum1>sum2) {
     		  return 1;
     		  
     	  }else {
     		  return -1;
     	  }
      }else {
    	  return 1;
      }
    }
}


    	
    
    
    


	
		
		
	

	
	
	
	
