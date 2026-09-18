class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String s : strs){
            int []frq = new int[26];

            for(char c : s.toCharArray()){
                frq[c-'a']++;
            }

            StringBuilder sb = new StringBuilder();
               
            for(int i : frq){
                    sb.append(i).append("#");
            } 

             String key = sb.toString();

            if(!map.containsKey(key)) 
            map.put(key, new ArrayList<String>());          

            map.get(key).add(s);
        }

        List<List<String>> res = new ArrayList<>();

        for(ArrayList<String> i : map.values()){
            res.add(i);
        }

        return res;
    }
}
