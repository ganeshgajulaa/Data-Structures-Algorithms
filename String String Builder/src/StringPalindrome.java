public class StringPalindrome {
    public static void main(String[] args) {
        String s = "";
//        String rev = "";
//        for(int i=s.length()-1;i>=0;i--){
//            rev+=s.charAt(i);
//        }
//        if(rev.equals(s)){
//            System.out.println("Palindrome");
//        }
//        else{
//            System.out.println("Not a Palindrome");
//        }

        System.out.println(palindrome(s));
    }
    static String palindrome(String s) {
        String ans = "Palindrome";
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            if (s.charAt(start) == (s.charAt(end))) {
                start += 1;
                end -= 1;
            } else {
                return ans = "Not a Palindrome";
            }
        }
        return ans;
    }
}