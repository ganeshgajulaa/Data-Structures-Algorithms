import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
    public static void main(String[] args) {
        List<String> ans = letterCombinations("12");
        System.out.println(ans);
    }

    static public List<String> letterCombinations(String digits) {
        return processed("", digits);
    }

    static public List<String> processed(String p, String up) {
        List<String> l = new ArrayList<>();

        if (up.isEmpty()) {
            List<String> l1 = new ArrayList<>();
            l1.add(p);
            return l1;
        }

        int digit = up.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            l.addAll(processed(p + ch, up.substring(1)));
        }

        return l;
    }
}