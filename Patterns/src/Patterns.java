

public class Patterns {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        pattern31(4);
    }



    static void pattern31(int n){
        for(int rows=0;rows<2*n-1;rows++){
            for( int cols=0;cols<2*n-1;cols++) {
                System.out.print(n-(Math.min(Math.min(rows, 2*n - rows-1 ), Math.min(2*n - cols-1 , cols))) +" ");
            }
            System.out.println();
        }
    }

//    static void pattern17(int n) {
//        for (int i = 1; i <= 2 * n - 1; i++) {
//            int spaces = i < n ? n - i : i - n;
//            for (int sp = spaces; sp > 0; sp--) {
//                System.out.print(" ");
//            }
//
//            int jSolved = i < n ? i : 2 * n - i;
//            for (int j = jSolved; j > 0; j--) {
//                System.out.print(j);
//            }
//
//            int kSolved = i < n ? i : 2 * n - i;
//            for (int k = 2; k <= kSolved; k++) {
//                System.out.print(k);
//            }
//            System.out.println();
//        }
//    }

//    static void pattern30(int n){
//        for (int i=1;i<=n;i++){
//            for(int sp=n-i;sp>0;sp--){
//                System.out.print("  ");
//            }
//            for(int j=i;j>0;j--){
//                System.out.print(j+" ");
//            }
//            for(int k=2;k<=i;k++){
//                System.out.print(k+" ");
//            }
//            System.out.println();
//        }
//    }

//    static void pattern28(int n) {
//        for (int i = 1; i <= 2 * n - 1; i++) {
//            int c = i > n ? 2 * n - i : i;
//            int sp = i > n ? i-n: n-i;
//            for (int spaces = 1; spaces <= sp; spaces++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= c; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

//    static void pattern2(int n){
//        for (int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

//    static void pattern1(int n){
//        for (int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

//    static void pattern3(int n){
//        for (int i=1;i<=n;i++){
//            for(int j=1;j<=n-i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

//    static void pattern4(int n) {
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//    }

//    static void pattern5(int n) {
//
//        for (int i = 1; i <= n * 2 - 1; i++) {
//            int c = (i > n) ? 2 * n - i : i;
//            for (int j = 1; j <= c; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
}