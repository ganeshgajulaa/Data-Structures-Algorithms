public class FirstQ {
    public static void main(String[] args) {
        printTillN(5);
    }

    static void printTillN(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);

        printTillN(n - 1);
    }

    static void printTillNRev(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }

        printTillNRev(n - 1);
        System.out.println(n);

    }

    static void printTillNBoth(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);

        printTillNBoth(n - 1);
        System.out.println(n);

    }
}
