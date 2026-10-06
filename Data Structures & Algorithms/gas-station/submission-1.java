class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int st = 0;
       int  money = 0;

        int igot = 0, ifucked = 0;
       for(int i = 0; i<gas.length; i++){
            igot += gas[i];
            ifucked += cost[i];
       }
       if(igot < ifucked) return -1;

        for(int i=0; i<gas.length; i++){
            if(gas[i]+money >= cost[i]){
                money += gas[i] - cost[i];
            }
            else{
                st = i +1;
                money = 0;
            }
        }
        return st;
    }
}
