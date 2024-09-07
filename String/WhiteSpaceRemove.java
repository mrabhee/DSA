package String;

public class WhiteSpaceRemove {
    public static void main(String[] args) {
        String str = "Hello My Name is Abhishek";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ' '){
                System.out.print(str.charAt(i));

            }

        }
    }
}
