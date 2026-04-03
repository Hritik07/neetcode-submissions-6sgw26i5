class Solution {
    public boolean isValid(String s) {
        Stack<Character> a = new Stack<>();
        for (int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '['){
                a.push(ch);
            }
            else{
                if (a.empty()) return false;
                char tos = a.peek();
                if ((ch == ')' && tos == '(') || 
                    (ch == '}' && tos == '{') || 
                    (ch == ']' && tos == '[')) {
                    a.pop();
             }
             else return false;
        }
        }
        return a.empty();
    }
}

