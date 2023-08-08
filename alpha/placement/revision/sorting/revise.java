public class revise {
    public static void bubblesort(int arr[]) {
        for (int turns = 0; turns < arr.length-1; turns++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j+1] = arr[j+1];
                arr[j+1] = temp;
                }
        }
            
        }
        
    }
    public static void printArr(int arr[]) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]+" ");
            }        
    }
    public static void main(String[] args) {
        int arr[] ={5,4,1,2,3}
    }
}
