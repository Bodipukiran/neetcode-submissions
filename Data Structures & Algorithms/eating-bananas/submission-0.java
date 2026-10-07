class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int l=1, r = 0;
        int res = Integer.MAX_VALUE;
        for(int i : piles){
            r = Math.max(r, i);
        }

        while(l <= r){
            int mid = (l+r)/2;

            int hi = 0;
            for(int i : piles){
                 hi += Math.ceil((double)i / mid);
            }

            if(hi > h){
                l = mid + 1;
            }
            else{
                res = mid;
                r = mid - 1;
            }
        }

        return res;
    }
}
