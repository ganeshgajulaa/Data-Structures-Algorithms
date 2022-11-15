public class CountZero {
    static int fun(int n, int count) {
        if (n % 10 == n) {
            return count;
        }
        int rem = n % 10;
        if (rem == 0) {
            return fun(n / 10, ++count);
        }
        return fun(n / 10, count);
    }

    public static void main(String[] args) {
        int n = 3000204;
        int ans = fun(n, 0);
        System.out.println(ans);
    }
}
