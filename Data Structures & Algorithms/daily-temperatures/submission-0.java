class Solution {
    public int[] dailyTemperatures(int[] nums) {

        Stack<Integer> st = new Stack<>();

        for(int i =0; i<nums.length; i++){
            while(!st.isEmpty() && nums[st.peek()] < nums[i]){
                int idx = st.pop();

                nums[idx] = i-idx;

            }
            st.push(i);

        }

        while(!st.isEmpty()){
            nums[st.pop()] = 0;

        }

        return nums;

        
    }
}
