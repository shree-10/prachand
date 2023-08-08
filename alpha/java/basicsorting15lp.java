import java.util.*;
public class basicsorting15lp{
    public static void bubblesort(int arr[]){
        for(int turn=0; turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printarr(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void selectionsort(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]< arr[j]){
                    minpos =j;
                }
            }
            //swap
            int temp =arr[minpos];
            arr[minpos] = arr[i];
            arr[i] =temp;
        }
    }

    public static void insertsort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr =arr[i];
            int prev =i-1;
            while(prev>=0 && arr[prev] > curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
        arr[prev+1]= curr;
        }
    }
     
     public static void main (String args[]){
        Integer arr[]={5,4,1,3,2};
       // insertsort(arr);
       Arrays.sort(arr,0,3,Collections.reverseOrder());
        printarr(arr);
    }
}