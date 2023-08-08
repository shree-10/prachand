import java .util.*;
public class swaping {
    // static void swapValuesUsingThirdVariable(int m, int n)
    // {
    //     // Swapping the values
    //     int temp = m;
    //     m = n;
    //     n = temp;
    //     System.out.println("Value of m is " + m + " and Value of n is " + n);
    // }
    // public static void main(String[] args)
    // {
        
    //     int m = 9, n = 5;
    //     swapValuesUsingThirdVariable(m, n);
    // }
    public static void main(String []args){
        int a=10,b=22;
       System.out.println("Before swapping Value of a is " + a + " and Value of b is " + b);
       a = (a + b) - (b = a);
       System.out.println("After Swapping Value of a is " + a + " and Value of b is " + b);
        
    }
}
