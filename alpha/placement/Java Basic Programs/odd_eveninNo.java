//number of even and odd digits in a number

import java.util.*;
public class odd_eveninNo {
        public static void main(String[] args) {
            int num = 12345678;
            int odd_count=0;
            int even_count =0;
            System.out.println("Number is : "+num);
            while (num>0) {
                num=num%10;
            if(num/2==0){
                
                even_count++;
            }
            else{
                
                odd_count++;
            }
                num=num/10;
            }
            
            System.out.println("even"+even_count);
            System.out.println("odd" +odd_count );

        }      
}
