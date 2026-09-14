class Solution {
    public int[] twoSum(int[] nums, int tar) {

     HashMap<Integer, Integer> map = new HashMap<>();  

     for(int i=0; i< nums.length; i++){
        int t = tar-nums[i];

        if(map.containsKey(t)){
            return new int[]{map.get(t), i};
        }
        map.put(nums[i], i);

     }

     return new int[]{-1};

    }
}
