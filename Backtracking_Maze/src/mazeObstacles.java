public class mazeObstacles {
    public static void main(String[] args) {
        boolean[][] board = {{true, true, true},
                            {true, false, true},
                            {true, true, true}};
        mazeRestrictions("", board, 0, 0);
    }

    static void mazeRestrictions(String p, boolean[][] board, int r, int c) {
        if (r == board.length - 1 && c == board[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!board[r][c]) {
            return;
        }

        if (r < board.length - 1) {
            mazeRestrictions(p + 'D', board, r + 1, c);
        }
        if (c < board[0].length - 1) {
            mazeRestrictions(p + 'R', board, r, c + 1);

        }
    }
}
