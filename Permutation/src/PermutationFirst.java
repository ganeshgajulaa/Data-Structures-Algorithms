import java.util.ArrayList;
import java.util.List;

public class PermutationFirst {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        fun("", "ab");
        System.out.println(permutationsCount2("", "abc",0));
    }

    static void fun(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            fun((p.substring(0, i) + ch + p.substring(i, p.length())), up.substring(1));
        }
    }

    static ArrayList<String> funAL(String p, String up) {
        ArrayList<String> list = new ArrayList<String>();

        if (up.isEmpty()) {
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            list.addAll(funAL((f + ch + s), up.substring(1)));
        }
        return list;
    }

    static void fun2(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            fun2((f + ch + s), up.substring(1));
        }
    }

    static int permutationsCount(String p, String up) {
        int count = 0;

        if (up.isEmpty()) {
            return 1;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count += permutationsCount((f + ch + s), up.substring(1));
        }
        return count;
    }

//    static int permutationsCount2(String p, String up,int count) {
//
//        if (up.isEmpty()) {
//
//        }
//
//        char ch = up.charAt(0);
//
//        for (int i = 0; i <= p.length(); i++) {
//            String f = p.substring(0, i);
//            String s = p.substring(i, p.length());
//            count+=permutationsCount2((f + ch + s), up.substring(1),count+ans);
//        }
//        return count;
    }
}
