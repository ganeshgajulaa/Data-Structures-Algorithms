public class Sorted {
    static boolean fun(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]>arr[index-1] && fun(arr,++index);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,9,11};
        boolean ans = fun(arr,1);
        System.out.println(ans);
    }
}
