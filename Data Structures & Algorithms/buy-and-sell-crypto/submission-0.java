class Solution {
    public int maxProfit(int[] pri) {

        int l = 0, r = 1;
        int res  = 0;
        while(r < pri.length){
            if(pri[l] < pri[r]){
                int pro = pri[r] - pri[l];
                res = Math.max(pro, res);
            }
            else{
                l = r;
            }
            r+=1;


        }
        return res;
    }
}
