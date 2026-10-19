class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int curr=0;
        int tem=0;
        while(curr<=j){
            if(nums[curr]==0){
                 tem=nums[i];
                nums[i]=nums[curr];
                nums[curr]=tem;
                i++;
                curr++;
                
            }
            else if(nums[curr]==1){
                curr++;

            }
           else if(nums[curr]==2){
             tem=nums[curr];
                nums[curr]=nums[j];
                nums[j]=tem;
                j--;

            }
        }
        
    }
}