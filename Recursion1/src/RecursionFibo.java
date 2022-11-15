public class RecursionFibo {
    public static void main(String[] args) {
//      System.out.println("Hello world!");
//        print(3);
//        System.out.println(fiboRecursion(1));
        for(int i=0;i<11;i++){
            System.out.println(fiboFormula(i));
        }

    }

    static int fiboFormula(int n){
        return (int)(Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }

//    static void print(int n) {
//        if (n == 5) {
//            System.out.println(5);
//            return;
//        }
//        System.out.println(n);
//        print(n + 1);
//    }

//    static void fibo(int n) {
//        int a = 0;
//        System.out.println(a);
//        int b = 1;
//        System.out.println(b);
//        while (n > 1) {
//            int temp = a;
//            a = b;
//            b = temp + a;
//            System.out.println(b);
//            n -= 1;
//        }
//    }
//
//    static int fiboRecursion(int n){
//        if(n==0){
//            return 0;
//        }
//        if(n==1){
//            return 1;
//        }
//        return fiboRecursion(n-2)+fiboRecursion(n-1);
//    }
}