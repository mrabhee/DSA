package Recursion;

public class FandLOcc {
    public static int first = -1;
    public static int last = -1;

    public static void Func(String str, int idx, char cChar) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if (cChar == str.charAt(idx)) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        Func(str, idx + 1, cChar);
    }

    public static void main(String[] args) {
        String str = "abshjharkhsafmkja";
        Func(str, 0, 'a');
    }
}
