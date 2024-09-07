package Recursion;

public class GobackX {
    public static void Func(String str, int i,int count , String newstr){
        if(i==str.length()){
            for(int j=0; j<count; j++){
                newstr += 'x';
            }
            System.out.println(newstr);
            return;
        }
        char current = str.charAt(i);
        if(current == 'x'){
            count++;
            Func(str,i+1,count,newstr);
        }
        else {
            newstr += current;
            Func(str,i+1,count,newstr);
        }


    }
    public static void main(String[] args) {
        Func("axcxbx",0,0,"");
    }
}
