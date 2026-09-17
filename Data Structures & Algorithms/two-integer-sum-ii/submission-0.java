class Solution {
    public int[] twoSum(int[] nums, int tar) {
        int l=0, r=nums.length-1;

        while(l < r){
            int sad = nums[l]+nums[r];

            if(sad == tar){
                return new int[]{l+1, r+1};
            }
            else if(sad > tar){
                r--;
            }
            else{
                l++;
            }
        }

        return new int[]{};
    }
}
