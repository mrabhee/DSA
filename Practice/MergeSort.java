package Practice;

public class MergeSort {
    public static void conquer(int arr[], int si, int mid, int ei) {
        int merge[] = new int[ei-si+1];
        int i1 = si;
        int i2 = mid+1;
        int x = 0;
        while (i1<=mid && i2<=ei){
            if(arr[i1]<=arr[i2]){
                merge[x++] = arr[i1++];
            }
            else {
                merge[x++] = arr[i2++];
            }
        }
        while(i1<=mid){
            merge[x++] = arr[i1++];
        }
        while (i2<=ei){
            merge[x++] = arr[i2++];
        }
        for(int i=0, j=si; i<merge.length; i++,j++){
            arr[j] = merge[i];
        }



    }

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        int n = arr.length;
        divide(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
