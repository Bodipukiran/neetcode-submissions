class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);

        for(int i : stones){
            pq.offer(i);
        }

        while(pq.size() > 1){
            int tmp = pq.poll()-pq.poll();
            if(tmp > 0)
            pq.offer(tmp);
        }

        return pq.isEmpty()? 0:pq.poll();
    }
}
