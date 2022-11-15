import java.util.Arrays;

public class selectionOpp {
    public static void main(String[] args){
        int[] arr = {5,-4,3,0,2,-1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[]arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int minIndex = getMinIndex(arr,0,last);

            swap(arr,minIndex,last);
        }
    }

    static int getMinIndex(int[] arr,int start,int end){
        int min =start;
        for(int i=start;i<=end;i++){
            if(arr[min]>arr[i]){
                min=i;
            }
        }
        return min;
    }

    static void swap(int[] arr,int first,int second){
        int temp=arr[second];
        arr[second]=arr[first];
        arr[first]=temp;
    }
}
