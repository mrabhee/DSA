package Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int Ar[] = {10,20,30,40};
        int Arcp[] = new int[Ar.length] ;
        for(int i=0; i<Ar.length; i++){
            Arcp[i] = Ar[i];
        }
        for(int j=0; j<Ar.length; j++){
            System.out.println(Arcp[j]);
        }

        //Ar = Arcp That reflact the same location of array element

    }
}
