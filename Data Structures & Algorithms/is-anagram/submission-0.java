class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> s1 = new HashMap<>();
        HashMap<Character, Integer> s2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            char ch1 = s.charAt(i);
            if(!s1.containsKey(ch1)){
            s1.put(ch1,1);
            }
            else{
                s1.replace(ch1, s1.get(ch1), s1.get(ch1)+1);
            }
        }
        for (int j = 0; j < t.length(); j++){
            char ch2 = t.charAt(j);
            if (!s2.containsKey(ch2)){
            s2.put(ch2, 1);
            }
            else {
                s2.replace(ch2, s2.get(ch2), s2.get(ch2)+1);
            }
        }
        if(s1.equals(s2)) return true;
        else return false;
    }
}
