import java.util.Arrays;

public class Pattern1 {

    static void fun(int r, int c) {
        if (r < 1) {
            return;
        }
        if (c < r) {
            System.out.print("*");
            fun(r, c + 1);
        } else {
            System.out.println();
            fun(r - 1, 0);
        }
    }

    static void funTriangleRev(int r, int c) {
        if (r < 1) {
            return;
        }
        if (c < r) {
            funTriangleRev(r, c + 1);
            System.out.print("*");

        } else {
            funTriangleRev(r - 1, 0);
            System.out.println();
        }
    }

    static void bubbleSort(int[] arr,int r, int c) {
        if (r < 1) {
            return;
        }
        if (c < r) {
            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubbleSort(arr,r,c+1);
        } else {
            bubbleSort(arr,r - 1, 0);
        }

    }

    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        fun(4,0);
//        funTriangleRev(4, 0);
        int[] arr = {4,5,3,2,1};
        bubbleSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    
}