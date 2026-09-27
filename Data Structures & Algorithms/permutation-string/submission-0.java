class Solution {
    public boolean checkInclusion(String s1, String s2) {

       int []need = new int[26]; 

        int []win = new int[26];

       for(char c : s1.toCharArray()){
            need[c-'a']++;
       }

       int l = 0;

       for(int r=0; r<s2.length(); r++){


            char c = s2.charAt(r);
            win[c-'a']++;

            if(r-l+1 > s1.length()){
                char ch = s2.charAt(l);
                win[ch-'a']--;
                l++;
            }

            if(r-l+1 == s1.length()){
                if(Arrays.equals(win, need)) return true;
            }


       }

       return false;

    }
}
