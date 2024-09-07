package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLs {
    public static void main(String[] args) {
        ArrayList<Integer> Inlist =new ArrayList<Integer>();
        ArrayList<String> Slist =new ArrayList<String>();
        //Adding Element to list
        Inlist.add(0);
        Inlist.add(1);
        Inlist.add(2);
        System.out.println(Inlist);
        //Get element from index
        int At_0 = Inlist.get(0);
        System.out.println(At_0);
        //add element in between
        Inlist.add(1,4);
        System.out.println(Inlist);
        //set at 1
        Inlist.set(1,8);
        System.out.println(Inlist);
        Inlist.remove(0);
        System.out.println(Inlist);
        int arrsize = Inlist.size();
        System.out.println(arrsize);
        //Traversinh
        for(int i=0; i<arrsize; i++){
            System.out.println(Inlist.get(i));
        }
        //Sorting
        Collections.sort(Inlist);
        System.out.println(Inlist);


    }
}
