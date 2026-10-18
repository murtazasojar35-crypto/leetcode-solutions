class Solution {
    public int singleNumber(int[] nums) {
          int Xorsum=0;
          for (int n:nums){
            Xorsum=Xorsum^n;
          }
          return Xorsum;

        
    }
}