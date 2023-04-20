package leetcode;

public class solution {
	
	public static int subarraysDivByK(int[] nums, int k) {
		
      int result=0,count=0;
      int[] prefix_sum = new int[k];
      prefix_sum[0]=1;
      for (int i=0; i<nums.length;i++) {
    	  //(nums[i] %k+k) used to avoid negative number
          result=(result+nums[i]%k+k)%k;
          
          //if in test case,only +ve number given then
          // result = result + nums[i]%k;
          count = count + prefix_sum[result];
          prefix_sum[result]++;
    	  
      }
      
      return count;
      
		
		
    }
	
//	public static void buildPrefixSumArr(int[] arr, int n, int[] prefixarr) {
//		
//		prefixarr[0]= arr[0];
//		
//		for(int i=1;i<n;i++) {
//			prefixarr[i]=prefixarr[i-1]+arr[i];
//			
//		}
//		
//	}

	
	public static void main(String[] args) {
		
		int[] nums = {4,5,0,-2,-3,1};
	//	int[] nums = {5};
		int k=5;
		//int k=9;
		System.out.println(subarraysDivByK(nums, k));
		
	}
}
