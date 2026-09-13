class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        int []arr1 = new int[26];
        

        for(int i=0; i<s.length(); i++ ){
            int j = t.length()-1-i;
            arr1[s.charAt(i)-'a']++;
            arr1[t.charAt(i)-'a']--;

        }

        for(int i : arr1){
            if(i != 0) return false;

        }

        return true;

    }
}
