class Solution {
    public boolean isValid(String str) {
        Stack<Character> st = new Stack<>();

        for(char s : str.toCharArray()){
            if(s == ')'){
                if(st.isEmpty()) st.push(s);
                else if(!st.isEmpty() && st.pop() != '(' ) return false;

            }
            else if(s == ']'){
                if(st.isEmpty()) st.push(s);
                    else if(!st.isEmpty() && st.pop() != '[' ) return false;
            }
            else if(s == '}'){
                    if(st.isEmpty()) st.push(s);
                    else if(!st.isEmpty() && st.pop() != '{' ) return false;
            }
            else {
                st.push(s);

            }

        }

        return (st.isEmpty())? true:false;
        
    }
}
