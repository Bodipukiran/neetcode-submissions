class Solution {
    public String minWindow(String s, String t) {
       int []win = new int[128]; 
       int count = t.length();

       for(char c : t.toCharArray())
            win[c]++;

        int l = 0;
        int max=Integer.MAX_VALUE, start = 0;
        for(int r=0; r<s.length(); r++){

            char c = s.charAt(r);
             if(win[c] > 0){
                count--;
             }
             win[c]--;

             while(count == 0){
                if(r-l+1 < max){
                    start = l;
                    max = r-l+1;
                }

                char ch = s.charAt(l);
                win[ch]++;
                if(win[ch] > 0) count++;
                l++;
                
             }
           

        }

        return max==Integer.MAX_VALUE ? "":s.substring(start, start+max);

    }
}
