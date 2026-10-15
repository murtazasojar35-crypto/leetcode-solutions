class Solution {

    public int[] twoSum(int[] numbers, int target) {
       int start=0;
       int end=numbers.length-1;
       while(start<end){
        int sum = numbers[end] + numbers[start];

        if (sum==target){
         return new int []{start+1,end+1};
        
        }
        else if(sum>target){
            end--;
        }
        if(sum<target){
            start++;
        }
       }
       return new int[]{-1, -1};

        
    }
}
 