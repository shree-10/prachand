import java .util.*;

public class binarysearch14lp{
    /* pairs array
    public static void Printpairs (int numbers[]){
        int tp=0;
        for(int i = 0; i < numbers.length ; i++){
            int curr = numbers[i];
        
        for(int j = i + 1  ; j < numbers.length; j++){
            System.out.print("("+ curr +"," +numbers[j]+")");
            tp++;       
        }
        System.out.println();
        }
        System.out.println("total =" + tp);
    }*/

    public static void subarr (int numbers[]){
        int currsum =0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0]=numbers[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1] + numbers[i];
        }
        for(int i=0; i<numbers.length;i++){
            int start =i;
            for(int j=i ;j<numbers.length;j++){
                int end =j;
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

             
                
                if(maxsum < currsum){
                    maxsum = currsum;
                }
               
            }
              
        }
 System.out.println("maxsum"+maxsum);
    }

    public static void kadanes(int numbers[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0; i<numbers.length;i++){
            cs=cs+numbers[i];
           if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("our ax subarry: "+ms);
    }
    public static void main (String args[]){
       int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
       kadanes(numbers);
       
    }
}