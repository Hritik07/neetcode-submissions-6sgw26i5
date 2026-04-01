class Solution {
    public boolean isPalindrome(String s) {
        String nospace = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int front = 0;
        int last = nospace.length()-1;
        while ( front < last ){
            if (nospace.charAt(front) != nospace.charAt(last)) return false;
            front++;
            last--;
        }
        return true;

    }
}
