class Solution {
    public int[] getConcatenation(int[] nums) {

        int[] res = new int[2*nums.length];

        for(int i =0; i<2*nums.length; i++ ){
            int idx = i % nums.length;

            res[i] = nums[idx];
        }
        return res;
    }
}