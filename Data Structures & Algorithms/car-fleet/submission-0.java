class Solution {
    public int carFleet(int tar, int[] pos, int[] spe) {

        Stack<Double> st = new Stack();

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for(int i =0; i<spe.length; i++){
            map.put(pos[i], spe[i]);

        }


        for(var i : map.descendingMap().entrySet()){

            if(!st.isEmpty() && (double)(tar-i.getKey() )/i.getValue() <= st.peek() )
            continue;
            else
            st.push((double)(tar-i.getKey() )/i.getValue());

        }

        return st.size();
        
    }
}
