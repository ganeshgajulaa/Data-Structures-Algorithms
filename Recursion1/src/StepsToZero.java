public class StepsToZero {
    static int count = 0;
    static int numberOfSteps(int n) {

        if(n==0){
            return count;
        }
        if(n%2==0){
            count++;
            return numberOfSteps(n/2);
        }
        if(n%2==1){
            count++;
            return numberOfSteps(n-1);
        }
        return -1;
    }

    public static void main(String[] args) {
        int n=8;
        int ans = numberOfSteps(n);
        System.out.println(ans);
    }
}
