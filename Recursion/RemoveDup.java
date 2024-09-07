package Recursion;

public class RemoveDup {
    public static boolean[] map = new boolean[26];
    public static void removedup(String str, int i,String newstr){
        if(i==str.length()){
            System.out.println(newstr);
            return;
        }
        char current = str.charAt(i);
        if(map[current-'a']){
            removedup(str,i+1,newstr);
        }
        else {
            newstr += current;
            map[current-'a'] = true;
            removedup(str,i+1,newstr);
        }

    }
    public static void main(String[] args) {
        removedup("abababa",0,"");

    }
}
