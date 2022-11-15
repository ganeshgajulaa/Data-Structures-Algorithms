public class SkipChar {
    public static void main(String[] args) {
//        skip("", "gan");
//        System.out.println(skip("gan"));
        System.out.println(skipAppNotApple("appapplegan"));

    }

    static void skip(String p, String uP) {
        if (uP.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = uP.charAt(0);

        if (ch == 'a') {
            skip(p, uP.substring(1));
        } else {
            skip(p + ch, uP.substring(1));
        }
    }

    static String skip(String uP) {
        if (uP.isEmpty()) {
            return "";
        }

        char ch = uP.charAt(0);

        if (ch == 'a') {
            return "" + skip(uP.substring(1));
        } else return ch + skip(uP.substring(1));

    }

    static String skipStr(String uP) {
        if (uP.isEmpty()) {
            return "";
        }
        if (uP.startsWith("apple")) {
            return skipStr(uP.substring(5));
        }
        else return uP.charAt(0) + skipStr(uP.substring(1));

    }

    static String skipAppNotApple(String uP) {
        if (uP.isEmpty()) {
            return "";
        }
        if (uP.startsWith("app") && !uP.startsWith("apple")) {
            return skipAppNotApple(uP.substring(3));
        }
        else return uP.charAt(0) + skipAppNotApple(uP.substring(1));

    }
}