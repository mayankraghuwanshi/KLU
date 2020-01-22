import java.util.*;
class main{
   
    static int partition(int arr[] , int l , int r){
        int pivote = r;
        for(int i=l;i<=r;i++){
            if(arr[i]<arr[pivote]){
                int temp = arr[l];
                arr[l]=arr[i];
                arr[i]=temp;
                l++;
            }
        }
        int temp = arr[l];
        arr[l]=arr[pivote];
        arr[pivote]=temp;
        return l;
    }
    static void quickSort(int arr[] , int l , int r){
        if(l<r){
            int pivote = partition(arr,l,r);
            quickSort(arr,l,pivote-1);
            quickSort(arr,pivote+1,r);
        }
    }

    public static  void main(String args[]){
        int arr[] = {5,3,2,3,5,6,2,13,5,4,2,34};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}