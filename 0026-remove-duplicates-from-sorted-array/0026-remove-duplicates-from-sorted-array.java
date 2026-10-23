class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=1;
        int n=nums.length;
        while(j<n){
            if(nums[i]==nums[j]){ 
                j++;
            }
            else{
                i++;
                nums[i]=nums[j];
                j++;

            }
        }
        return i+1;

        
    }
}