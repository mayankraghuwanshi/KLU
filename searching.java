import java.util.*;
class main{
    //https://github.com/mayankraghuwanshi/KLU
    // https://www.interviewbit.com/courses/programming/topics/binary-search/
    static int binarySearch(int arr[] , int item){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==item) return mid;
            else if(arr[mid]>item){
                right = mid-1; 
            }
            else{
                left = mid+1;
            }
        }
        return -1;

    }
    public static  void main(String args[]){
        int arr[] = {1,2,3,4,56,88,98,100};
        System.out.println(binarySearch(arr,101));


    }
}