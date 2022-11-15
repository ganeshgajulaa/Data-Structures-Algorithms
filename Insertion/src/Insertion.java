import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        int[] nums = {5,3,4,2,-1,0,1};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void selectionSort(int[] arr){
        for (int i=0;i<=arr.length-2;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
    }
}