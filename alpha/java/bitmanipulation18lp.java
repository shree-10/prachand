public class bitmanipulation18lp {
    // public static void oddoreven(int n){
    //     // int bitMask = 1;
    //     // if((n & bitMask) == 0){
    //     //    System.out.println("even no");
    //     // }  else{
    //     //     System.out.println("odd no");
    //     // }
        

    // }
    // public static int getithbit(int n, int i){
    //     int bitMask = 1<<i;
    //     if((n & bitMask) == 0){
    //         return 0;
    //     }
    //     else{
    //         return 1;
    //     }
    // }
    // public static void main(String[] args){

       //and,or,xor,1'st complement ,binary left shift,Biary right shift
       // and when 1&1 =1 
    //    System.out.println(5 & 6);//and
    //    System.out.println(5 | 6);//or
    //    System.out.println(5 ^ 6);//xor
    //    System.out.println(~5);//1'stcomp + add 1
//binary left shift
    //    System.out.println(5 << 6);
    //    System.out.println(6 >> 1);
         //odd-> =lsb->1; even->= lsb->0
        
        //   oddoreven(11);
        //   oddoreven(2);
        //   oddoreven(17);

        //get ith bit ; setithbit ; clear ith bit
          // System.out.println(getithbit(10,3));  

  //  }
  
  public static void main(String[] args){
    //    int x = 3, y = 4;
    //    System.out.println("befor swap: " + x + " and y= " + y);
    //    x=x^y;
    //    y=x^y;
    //    x=x^y;
    //    System.out.println("After swap: x = "+x+" and y = "+y);
    
    // int x=6;
    // System.out.println(x+" + "+1+" is "+-~x);
    // x= -4;
    // System.out.println(x+" + "+1+" is "+-~x);
    // x=0;
    // System.out.println(x+" + "+1+" is "+-~x);

    for(char ch='A';ch<='Z';ch++) {
        System.out.println((char)(ch|' '));
    }

  }


}


