class Solution {
    public int maxArea(int[] nums) {
      int max = 0;

      int l=0, r=nums.length-1;

      while(l < r) {
        int area = (r-l) * Math.min(nums[r], nums[l]);

        max = Math.max(max, area);

        if(nums[l] > nums[r]) r--;
        else if(nums[r] > nums[l]) l++;
        else {
            l++;
            r--;
        }
      }

      return max;     
    }
}
