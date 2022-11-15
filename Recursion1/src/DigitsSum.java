public class DigitsSum {
    public static void main(String[] args){
        System.out.println(digitsSum(55));
    }

    static int digitsSum(int n ){
        if(n==0){
            return 0;
        }
        return n%10 + digitsSum(n/10);
    }
}
