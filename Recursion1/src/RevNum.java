public class RevNum {
    public static void main(String[] args) {
        int ans = reverseNum(5544);
        System.out.println(ans);
    }


    static int reverseNum(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return helperFun(n, digits);
    }

    static int helperFun(int n, int args) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, args - 1)) + helperFun(n / 10, args - 1);
    }
}
