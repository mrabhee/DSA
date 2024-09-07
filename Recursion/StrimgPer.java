package Recursion;

public class StrimgPer {
    public static void PrintPer(String str,String per){
        if(str.length() == 0){
            System.out.println(per);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char current = str.charAt(i);
            String newstr = str.substring(0,i)+str.substring(i+1);
            PrintPer(newstr,per+current);

        }
    }
    public static void main(String[] args) {
        PrintPer("abc","");
    }
}
