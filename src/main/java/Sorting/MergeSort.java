package Sorting;


import java.util.Scanner;

public class MergeSort {
    private  static void mergeSort(int arr[],int left, int right)
    {
        if(left<right){
            int mid = left+ (right -left)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);

            merge(arr,left,mid,right);
        }
    }
    private static void merge(int arr[], int left, int mid, int right){
        int n1= mid - left +1;
        int n2= right - mid;
        //create temp array
        int L[] = new int[n1];
        int R[] = new int[n2];

        //Store the data to temp array
        int i,j,k;
        for(i=0;i<n1;i++)
            L[i]= arr[left+i];
        for(i=0;i<n2;i++)
            R[i] = arr[mid+1+i];

        //Merge the temp arrays
        i=j=0; k=left;
        while(i<n1 && j<n2){
            if(L[i] < R[j]){
                arr[k]=L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        //Add the remaining
        while(i<n1){
            arr[k] = L[i];
            k++;
            i++;
        }
        while(j<n2){
            arr[k] = R[j];
            k++;
            j++;
        }
    }
    public static void main(String args[]){
        int arr[] =new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i =0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        mergeSort(arr,0, arr.length-1);
        for (int n:arr) {
           System.out.print(n+" ");
        }
    }
}
