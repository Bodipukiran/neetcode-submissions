class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int []left = new int[n];
        int []right = new int[n];
        int l=1, r=1;

        for(int i=0; i<n; i++){
            int j = n - 1 - i;

            left[i] = l;
            l *= nums[i];
            right[j] = r;
            r *= nums[j];

        }

        for(int i=0; i<n; i++){
            nums[i] = left[i]*right[i];
        }

        return nums;
        
    }
}  
