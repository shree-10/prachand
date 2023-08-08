public class functions12lp{
   /* public static float sum(float а, float b) {
    return a + b  ;
}

public static void main(String args[]) {
    System.out.println(sum(3, 5));
    System.out.println(sum(3.2f, 4.8f));
 
    }
   
    //prime no
    public static boolean isPrime(int n){
     if(n == 2) {
        return true;
    }
    for(int i=2; i<=Math.sqrt(n); i++) {
        if(n % i == 0) {
            return false;
        }  
    }                    
    return true;
    }

    public static void main(String args[]) {
    System.out.println(isPrime(7));
 }
 */
 //prime no in range
       public static void primeInRange(int n){
        for(int i =2; i<=n;i++){
            if( isPrime (i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        primeInRange(20);
    }    


}