import java.util.ArrayList;
import java.util.List;

public class Maze {
    public static void main(String[] args) {
        System.out.println(pathRetCount("", 3, 3));
    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int left = count(r - 1, c);
        int right = count(r, c - 1);
        return left + right;
    }

    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            path(p + 'D', r - 1, c);
        }
        if (c > 1) {
            path(p + 'R', r, c - 1);

        }
    }

    static List<String> pathRet(String p, int r, int c) {
        List<String> l = new ArrayList<>();
        if (r == 1 && c == 1) {
            l.add(p);
            return l;
        }

        if (r > 1) {
            l.addAll(pathRet(p + 'D', r - 1, c));
        }
        if (c > 1) {
            l.addAll(pathRet(p + 'R', r, c - 1));
        }
        return l;
    }

    static List<String> pathDg(String p, int r, int c) {
        List<String> l = new ArrayList<>();
        if (r == 1 && c == 1) {
            l.add(p);
            return l;
        }

        if (r > 1) {
            l.addAll(pathDg(p + 'D', r - 1, c));
        }
        if (c > 1) {
            l.addAll(pathDg(p + 'R', r, c - 1));
        }
        if(r>1 && c>1){
            l.addAll(pathDg(p + "Dg", r - 1, c - 1));
        }
        return l;
    }

    static int pathRetCount(String p, int r, int c) {

        if (r == 1 && c == 1) {
            return 1;
        }
        int left=0;
        int right=0;
        int dg=0;

        if (r > 1) {
            left  += pathRetCount(p + 'D', r - 1, c);
        }
        if (c > 1) {
            right += pathRetCount(p + 'R', r, c - 1);
        }
        if(r>1 && c>1){
            dg = dg + pathRetCount(p + "Dg", r - 1, c - 1);
        }
        int ans = left+right+dg;
        return ans;
    }

    
}