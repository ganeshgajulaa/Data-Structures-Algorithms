import java.util.Arrays;

public class BacktrackingFourPaths {
    public static void main(String[] args) {
        boolean[][] board = {{true, true, true},
                {true, true, true},
                {true, true, true}};
        int[][] path = new int[board.length][board[0].length];
        allPathsSteps("", board, 0, 0, path, 1);
    }

    static void allPathsSteps(String p, boolean[][] board, int r, int c, int[][] path, int steps) {
        if (r == board.length - 1 && c == board[0].length - 1) {
            path[r][c] = steps;

            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!board[r][c]) {
            return;
        }

        board[r][c] = false;
        path[r][c] = steps;

        if (c > 0) {
            allPathsSteps(p + 'L', board, r, c - 1, path, steps+1);
        }

        if (r < board.length - 1) {
            allPathsSteps(p + 'D', board, r + 1, c, path, steps+1);
        }

        if (c < board[0].length - 1) {
            allPathsSteps(p + 'R', board, r, c + 1, path, steps+1);
        }

        if (r > 0) {
            allPathsSteps(p + 'U', board, r - 1, c, path, steps+1);
        }
        board[r][c] = true;
        path[r][c] = 0;

    }

    static void allPaths(String p, boolean[][] board, int r, int c) {
        if (r == board.length - 1 && c == board[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!board[r][c]) {
            return;
        }

        board[r][c] = false;

        if (c > 0) {
            allPaths(p + 'L', board, r, c - 1);
        }

        if (r < board.length - 1) {
            allPaths(p + 'D', board, r + 1, c);
        }

        if (c < board[0].length - 1) {
            allPaths(p + 'R', board, r, c + 1);
        }

        if (r > 0) {
            allPaths(p + 'U', board, r - 1, c);
        }
        board[r][c] = true;
    }
}
