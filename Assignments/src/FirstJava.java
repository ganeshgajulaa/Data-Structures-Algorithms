import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FirstJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int[][] nums = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        int[] arr = {0, 1, 0};
        int[] index = {0, 1, 0};

        String sentence = "leetcode";

        int[][] gain = {{1,2,3},{4,5,6}};
        System.out.println(((Arrays.deepToString(transpose(gain)))));
//        System.out.println(largestAltitude(gain));

//        System.out.println(checkIfPangram(sentence));

//        System.out.println(Arrays.toString(createTargetArray(arr, index)));

//        List<Boolean> ans = kidsWithCandies(arr, 1);
//        System.out.println(maximumWealth(nums));


//        System.out.println(Arrays.toString(getConcatenation(nums)));
//        System.out.println(Arrays.toString(buildArray(nums)));

//        System.out.println(sumN(5));
//        prime(3, 12);
//        System.out.println(pTriplet(1,4,5));

//        System.out.println(palindrome(5455));
//        System.out.println(max(a,b,c));
//        System.out.println(min(a,b,c));
    }

    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<Integer>();
        Integer sum=0;
        for(int i=0;i<num.length;i++){
            sum= sum+(num[i]* (int)Math.pow(10,num.length-i-1));
        }
        sum+=k;

        for(int j=0;j<sum.;j++){

        }

        return ans;
    }

    static public int[][] transpose(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
            }
        }
        return matrix;
    }

    static public int findNumbers(int[] nums) {
        int even = 0;
        for (int i:nums) {
            int digits = 0;

            int n = i;
            while (n > 0) {
                digits += 1;
                n /= 10;
            }
            if (digits % 2 == 0) {
                even += 1;
            }
        }
        return even;
    }

    static public int largestAltitude(int[] gain) {
        int[] res = new int[gain.length + 1];
        int high = Integer.MIN_VALUE;

        res[0] = 0;

        for (int i = 1; i < res.length; i++) {
            res[i] = gain[i - 1] + res[i - 1];
        }

        for (int e : res) {
            if (high < e) {
                high = e;
            }
        }

        return high;
    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        int j = 0;
        if (ruleKey.equals("type"))
            j = 0;

        if (ruleKey.equals("color"))
            j = 1;

        if (ruleKey.equals("name"))
            j = 2;


        for (List<String> item : items) {
            if (item.get(j).equals(ruleValue)) count++;
        }

        return count;
    }

    static public boolean checkIfPangram(String sentence) {

        if (sentence.length() <= 25) {
            return false;
        }

        boolean[] ans = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            for (int j = 0; j < 26; ) {
                if (sentence.charAt(i) == 'a' + j) {
                    ans[j] = true;
                    break;
                } else j++;
            }
        }

        for (int i = 0; i < ans.length; i++) {
            if (ans[i] != true) {
                return false;
            }
        }
        return true;
    }

    static public int[] createTargetArray(int[] nums, int[] index) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = 0;
        }

        for (int i = 0; i < index.length; ) {
            int correct = index[i];

            if (ans[correct] == 0) {
                ans[correct] = nums[i];
                i++;
            } else {
                for (int j = ans.length - 1; j > correct; j--) {
                    int temp = ans[j];
                    ans[j] = ans[j - 1];
                    ans[j - 1] = temp;
                }
            }
        }
        return ans;
    }

    private static void swap(int[] ans, int i, int i1) {
        int temp = ans[i + 1];
        ans[i + 1] = ans[i];
        ans[i] = temp;
    }


    static public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j] && j != i) {
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }

    static public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = max(candies);

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }

    static int max(int[] candies) {
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            } else max = max;
        }
        return max;
    }

    static public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; ) {
            for (int j = 0; j < n; ) {
                for (int k = n; k < nums.length; ) {
                    ans[i] = nums[j];
                    ans[i + 1] = nums[k];
                    i += 2;
                    j++;
                    k++;
                }
            }
        }
        return ans;
    }


    static public int maximumWealth(int[][] accounts) {

        int finalMax = 0;
        for (int i = 0; i < accounts.length; i++) {
            int max = 0;
            int prevMax = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                max = max + accounts[i][j];
            }
            if (max > finalMax) {
                finalMax = max;
            } else {
                finalMax = finalMax;
            }
        }
        return finalMax;
    }

    static public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < ans.length; i++) {
            for (int j = i; j >= 0; j--) {
                ans[i] += nums[j];
            }
        }
        return ans;
    }

    static public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }

    static public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    static int sumN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    static void prime(int a, int b) {
        for (int i = a; i <= b; i++) {
            int flag = 0;

            for (int j = 2; j <= i / 2; ) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                } else {
                    j++;
                }
            }
            if (flag == 0) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean pTriplet(int a, int b, int n) {
        if (Math.pow(n, 2) == (Math.pow(a, 2) + Math.pow(b, 2))) {
            return true;
        }
        return false;
    }

    static boolean palindrome(int n) {
        int ans = n;
        int result = 0;

        while (ans > 0) {
            int rem = ans % 10;
            result = (result * 10) + rem;
            ans /= 10;
        }
        if (result == n) {
            return true;
        }
        return false;
    }

//    int a = in.nextInt();
//    int b = in.nextInt();
//    int c = in.nextInt();

    static int max(int a, int b, int c) {
        int max = a;
        if (b > a && b > c) {
            max = b;
        }
        if (c > a && c > b) {
            max = c;
        }
        return max;
    }

    static int min(int a, int b, int c) {
        int min = a;
        if (b < a && b < c) {
            min = b;
        }
        if (c < a && c < b) {
            min = c;
        }
        return min;
    }


//        int i = n;
//        while (i > 0) {
//            if (i == 1) {
//                n = n * 1;
//                i--;
//            } else {
//                n = n * (i - 1);
//                i--;
//            }
//        }
//        System.out.println(n);

//        int sum = 0;
//
//        int max = 0;
//        while(n!=0){
//            int temp = 0;
//            if(n>temp){
//                max= n;
//            }
//            else{
//                max= temp;
//            }
//            n = in.nextInt();
//        }
//        System.out.println(max);

//
//        int i = 1;
//        while (i <= n) {
//            if (n % i == 0) {
//                System.out.println(i);
//                i++;
//            } else i++;
//        }

//        int n2 = in.nextInt();

//        int sum = 0;
//        int f = n1;
//        while (f > 0) {
//            int rem = f % 10;
//            sum = sum + (int) Math.pow(rem, 3);
//            f /= 10;
//        }
//
//        int s = n2;
//        int sum2 = 0;
//        while (s > 0) {
//            int rem = s % 10;
//            sum2 = sum2 + (int) Math.pow(rem, 3);
//            s /= 10;
//        }
//
//        if (sum == n1) {
//            System.out.println("ArmS");
//        }
//
//        if (sum2 == n2) {
//            System.out.println("ArmS");
//        }


//        String ans = "Palindrome";

//        String str = "jjk";
//        int s = 0;
//        int e = str.length() - 1;
//        while (s <= e) {
//            if (str.charAt(s) == str.charAt(e)) {
//                s++;
//                e--;
//            } else {
//                ans = "Not Palindrome";
//                System.out.println(ans);
//                return;
//            }
//        }
//        System.out.println(ans);

//        int n = in.nextInt();
//
//        int a = 0;
//        int b = 1;
//        System.out.println(a);
//        System.out.println(b);
//
//        for (int i = n; i > 1; i--) {
//            int temp = a;
//            a = b;
//            b = a + temp;
//            System.out.println(b);
//        }

//        int rupee = in.nextInt();
//        System.out.println(rupee*0.012);

//        int f = in.nextInt();
//        int s = in.nextInt();
//
//        if(f>s){
//            System.out.println(f);
//        }
//        else System.out.println(s);

//        char ch = in.next().charAt(0);
//
//        if(ch == '+'){
//            System.out.println(f+s);
//        }
//
//        if(ch == '-'){
//            System.out.println(f-s);
//        }
//
//        if(ch == '*'){
//            System.out.println(f*s);
//        }
//
//        if(ch == '/'){
//            System.out.println(f/s);
//        }
//
//        if(ch == '%'){
//            System.out.println(f%s);
//        }


//        int p = in.nextInt();
//        int t = in.nextInt();
//        int r = in.nextInt();
//
//        double sI = (p * t * r)/100;
//        System.out.println(sI);


//        String n = in.next();
//        System.out.println("Hello " + n);


//        int n = in.nextInt();
//        if(n%2==0){
//            System.out.println("Even");
//        }
//        else{
//            System.out.println("Odd");
//        }
}

