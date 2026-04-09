class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') continue;

                if (set.contains(c)) return false;
                set.add(c);
            }
        }
        for (int j = 0; j < 9; j++) {
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                char c = board[i][j];
                if (c == '.') continue;

                if (set.contains(c)) return false;
                set.add(c);
            }
        }
        for (int box = 0; box < 9; box++) {
            Set<Character> set = new HashSet<>();

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {

                    int row = (box / 3) * 3 + i;
                    int col = (box % 3) * 3 + j;

                    char c = board[row][col];
                    if (c == '.') continue;

                    if (set.contains(c)) return false;
                    set.add(c);
                }
            }
        }

        return true;
    }
}