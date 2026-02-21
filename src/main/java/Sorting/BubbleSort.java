package Sorting;

public class BubbleSort {
    public static int[] sort(int []arr){

        int i,j,swap;
        for(i=0;i<arr.length-1;i++){
            for(j=0;j< arr.length-1;j++){
               if(arr[j] > arr[j+1])
               {
                 swap=arr[j];
                 arr[j]= arr[j+1];
                 arr[j+1] = swap;
               }
            }
        }

        return arr;
    }

    public static void main(String args[]){
        int arr[] ={ 5, 1, 4, 2, 8 };
        sort(arr);
        for (int a:arr) {
            System.out.println(a);
        }

    }
}
