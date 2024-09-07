package String;

public class StringBuilderss {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Abhishek");
        System.out.println(sb);

        sb.setCharAt(0,'P');
        System.out.println(sb);
        sb.insert(sb.length(),'s');
        System.out.println(sb);
        sb.delete(1,5);
        System.out.println(sb);

        for (int i = 0; i < sb.length() / 2; i++) {
            int back = sb.length() - 1 - i;
            char frontchar = sb.charAt(i);
            char backchar = sb.charAt(back);

            sb.setCharAt(i, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);
    }
}
