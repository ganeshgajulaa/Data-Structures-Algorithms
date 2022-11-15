import java.util.ArrayList;

public class AsciiValue {
    public static void main(String[] args) {
//        System.out.println(asciiChar('a'));
        char ch = 'a';
//        System.out.println(ch+0);
//        System.out.println((char)(ch+0));
//        subSeqAscii("", "abc");
        System.out.println(subSeqAL("","abc"));
    }

    static void subSeqAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subSeqAscii(p + ch, up.substring(1));
        subSeqAscii(p, up.substring(1));
        subSeqAscii(p + (ch + 0), up.substring(1));

    }

    static ArrayList<String> subSeqAL(String p, String up) {
        ArrayList<String> list = new ArrayList<>();

        if (up.isEmpty()) {
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subSeqAL(p + ch, up.substring(1));
        ArrayList<String> right = subSeqAL(p, up.substring(1));
        ArrayList<String> ascii = subSeqAL(p + (ch +0), up.substring(1));


        left.addAll(right);
        left.addAll(ascii);
        return left;
    }

    static int asciiChar(int c) {
        return (int) (c);
    }
}
