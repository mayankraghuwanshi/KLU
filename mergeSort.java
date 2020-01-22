import java.util.*;
class main{
    // https://github.com/mayankraghuwanshi/KLU

    static int [] mergeSort(int arr[] , int left , int right){
        if(left==right){
            int res[] = new int[1];
            res[0] = arr[right];
            return res;
        }
        int pivote = (left+right)/2;
        int leftArr[] = mergeSort(arr,left,pivote);
        int rightArr[] = mergeSort(arr,pivote+1,right);
        return merge(leftArr,rightArr);
    }
    // right = [1,6,5,3,2]|  left = [9,12,34]
    static int[] merge(int left[] , int right[]){
        int i=0;
        int j=0;
        int k=0;
        int res[] = new int[left.length+right.length];
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                res[k++]=left[i++];
            }else{
                res[k++]=right[j++];
            }
        }
        while(i<left.length){
            res[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            res[k]=right[j];
            j++;
            k++;
        }
        return res;
    }

  

    public static  void main(String args[]){
        int arr[] = {5,3,2,3,5,6,2,13,5,4,2,34};
        System.out.println(Arrays.toString(mergeSort(arr,0,arr.length-1)));
    }
}