package String;

import Patterns.SolidRhombus;

public class PalindromString {
    public static void main(String[] args) {
        String A = "naman";
        int n = A.length();

//        method 1
//        for (int i = 0; i < n/2; i++) {
//            if (A.charAt(i) == A.charAt(n-i-1)){
//                System.out.println("Palindrom");
//            }
//            else {
//                System.out.println("not");
//            }
//        }

//        method 2
        String B = "";
        for (int i = n - 1; i >= 0; i--) {
            B = B + A.charAt(i);
        }
        System.out.println(B);
        if (A.equals(B)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
