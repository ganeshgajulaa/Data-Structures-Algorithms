public class missinNum {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println(firstMissingPositive(arr));
//        System.out.println(missingNumber(arr));

    }
    static public int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct=arr[i]-1;
            if (arr[i] > 0 && arr[i] < arr.length) {
                if (arr[i] != arr[correct]) {
                    int temp = arr[i];
                    arr[i] = arr[correct];
                    arr[correct] = temp;
                } else i++;
            }
            else i++;
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return j + 1;
            }
        }

        return arr.length + 1;
    }


//    static public int missingNumber(int[] arr) {
//        int i = 0;
//        while (i < arr.length) {
//
//            int correct = arr[i];
//            if (arr[i] == arr.length) {
//                i++;
//            } else {
//                if (arr[i] != arr[arr[i]]) {
//                    int temp = arr[i];
//                    arr[i] = arr[correct];
//                    arr[correct] = temp;
//                } else {
//                    i++;
//                }
//            }
//        }
//        for (int j=0;j<arr.length;j++){
//            if(arr[j]!=j){
//                return j;
//            }
//        }
//        return arr.length;
//    }
}