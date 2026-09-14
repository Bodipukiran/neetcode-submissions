class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+ 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> hp = new PriorityQueue<>((a, b)-> b.getValue() - a.getValue());

        for(var i : map.entrySet()){
            hp.offer(i);

        }

        int []res = new int[k];
        int l = 0;
        while(k-- > 0){
                res[l++] = hp.peek().getKey();
                hp.poll();
        }

        return res;


        
    }
}
