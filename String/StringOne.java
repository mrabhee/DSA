package String;

public class StringOne {
    public static void main(String[] args) {
        String name = "Abhishek";
        System.out.println(name);
        String name2 = "Ankit";
        System.out.println(name2);
        name2 = name;
        System.out.println(name2);
        System.out.println(name.equals(name2));
//        String temp = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }

    }
}
