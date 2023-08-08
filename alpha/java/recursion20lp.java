import java.util.*;


public class recursion20lp {
    //print thr dec no
    public static void printDec(int n){
     if(n == 1){
         System.out.println(n);
         return;
     }
     System.out.println(n +" ");
     printDec(n-1);
}

    
     
    //print the inc no
    public static void printInc(int n){
    if(n == 1){
        System.out.println(n+" ");
        return;
    }
    printInc(n-1);
    System.out.println(n +" ");
}

    //print factriol
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;

    }


    //print sum of first n nartural no
    public static int nartural(int n) {
        if(n==1){
            return 1;
        }
        int narm1 = nartural(n-1);
        int nar = n + nartural(n-1);
        return nar;
        
    }

    //print fibonacci number
    public static int fibo(int n){
        if (n == 0 || n == 1){
            return n;
        }
        
        int fibonm1 = fibo(n - 1);
        int fibonm2 = fibo(n - 2);
        return fibonm1 + fibonm2;   
}
    //sorted array
    public static boolean issorted(int arr[], int i ) {
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return issorted(arr, i+1);
        
    }
    // waf to the first occurence of an element in an array
    public static int firstOccurence (int arr[],int key, int i){
        if(i == arr.length){
            return -1;
        }
        if (arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
    
    // x^n
    public static int power (int x,int n) {
        if(n == 0){
            return 1;
        } 
        int xm1 = power(x, n-1);
        int  xn = x * xm1;
        return xn;
        //return x * power(x,n-1);

    }

    public static void main(String args[]){
    //int n = 25 ;
    //int arr[]={1,2,3,4};
    System.out.println(power(2, 2));
    
 }
}
