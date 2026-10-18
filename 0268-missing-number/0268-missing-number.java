class Solution {
    public int missingNumber(int[] nums) {
        int Xorsum=0;
        for (int n : nums){
            Xorsum=Xorsum^n;
        }
        for(int i=0;i<=nums.length;i++){
            Xorsum=Xorsum^i;
        }
        return Xorsum;
        
    }
}