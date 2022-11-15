import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        int[] nums = {1,-7,-8,-9,0};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static boolean swapped = false;
    static void bubbleSort(int[] nums){
        int i;
        for (i=0;i<nums.length;i++){
            for(int j=1;j<nums.length-i;j++){
                if(nums[j]<nums[j-1]){
                    swap(nums,j,j-1);
                }
            }
            if(!swapped){
                break;
            }
        }

    }

    static void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
        swapped = true;
    }
}