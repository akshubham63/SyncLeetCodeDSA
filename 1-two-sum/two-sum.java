class Solution {
    public int[] twoSum(int[] nums, int target) {
        // First Problem
        for(int i = 0; i < nums.length; i++){
            int temp = i + 1;
            while(temp < nums.length){
                if(nums[i] + nums[temp] == target){
                    return new int[] {i, temp};
                }
                temp++;
            }
        }
        return new int[] {};
    }
}