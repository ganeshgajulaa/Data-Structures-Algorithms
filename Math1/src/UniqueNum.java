public class UniqueNum {
    public static void main(String[] args) {
        int[] arr = {55, 55, 66, 77, 66, 88, 88};
        System.out.println(ans(arr));
    }

    static int ans(int[] arr){
        int unique = 0;
        for(int n:arr){
            unique^=n;
        }
        return unique;
    }
}
