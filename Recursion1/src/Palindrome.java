public class Palindrome {
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

    static boolean palindrome(int n){
        return n==reverseNum(n);
    }

    static void palin2(int n,int count){

    }

    public static void main(String[] args) {
//        boolean ans = palindrome(554455);
//        System.out.println(ans);
    }
}
