package Sorting;

public class SmallestElement {
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        int temp = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                }
            }
        }
        System.out.println(temp);
    }
}
