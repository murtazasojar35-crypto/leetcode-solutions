class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
         for (int i=0;i<nums.length;i++){
              //sum create
            sum=sum+nums[i];
            //find maxsum
            maxsum=Math.max(maxsum,sum);
            //if negative value 
            if (sum<0){
                sum=0;
            }
         }
           return maxsum;
    }
}