class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();

        int l=0;
        int n = s.length();
        int max = 0;
        int cmax = 0;
        for(int r=0; r<n; r++){
            char c = s.charAt(r);
            map.put(c, map.getOrDefault(c, 0)+1 );
            cmax = Math.max(cmax, map.get(c));

            while((r-l+1-cmax) > k ){
                char ch = s.charAt(l);
                map.put(ch, map.getOrDefault(ch, 0)-1 );
                if(map.get(ch) == 0)
                        map.remove(ch);
                l+=1;        

            }

            max = Math.max(max, r-l+1);
        } 

        return max;
        
    }
}
