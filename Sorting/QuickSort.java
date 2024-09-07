package Sorting;

public class QuickSort {
    public static int pivotFinder(int arr[] , int low , int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low; j<high; j++){
            if (arr[j]<pivot){
                i++;
                //swapp
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }
    public static void quickSort(int arr[] , int low , int high) {
        if(low<high){
            int pidx = pivotFinder(arr,low,high);
            quickSort(arr,low,pidx-1);
            quickSort(arr,pidx+1,high);
        }

    }
    public static void main(String[] args) {
        int arr[] ={4,5,6,8,2,7};
        int n = arr.length;
        quickSort(arr,0,n-1);
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
