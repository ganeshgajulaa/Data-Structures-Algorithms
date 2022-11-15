import java.util.ArrayList;

public class Linear {
    static boolean fun(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        if (arr[index] == target) {
            return true;
        }
        return fun(arr, target, ++index);
    }

    static int funIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return funIndex(arr, target, ++index);
    }


    static int funIndexLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return funIndexLast(arr, target, index - 1);
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void funIndexAll(int[] arr, int target, int index) {
        if (index == -1) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        funIndexAll(arr, target, index - 1);
    }

    static ArrayList funIndexArrayList(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == -1) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return funIndexArrayList(arr, target, index - 1, list);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 3};
        int target = 3;
        ArrayList<Integer> list1 = new ArrayList<Integer>();
//        boolean ans = fun(arr,target,0);
//        int ansIndex = funIndex(arr, target, 0);
//        int ansLast = funIndexLast(arr, target, arr.length - 1);


//        System.out.println(ans);
//        System.out.println(ansLast);
//        funIndexAll(arr, 3, arr.length - 1);
        //        System.out.println(list);

        System.out.println(funIndexArrayList(arr, target, arr.length - 1, list1));

    }
}
