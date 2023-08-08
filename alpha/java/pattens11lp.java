public class pattens11lp{
    public static void main(String args[]){
       /*
       for(int line=1; line<=4; line++){
           for(int star=1; star<=line; star++) {
              System. out.print("*");
            }
            System.out.println();
       }
        int n=4;
        for(int line=1; line<=n; line++){
           for(int star=1; star<=n-line+1; star++) {
              System. out.print("*");
            }
            System.out.println();
        }
        
        for(int line=1; line<=4; line++){
           for(int star=1; star<=line; star++) {
              System. out.print(star);
            }
            System.out.println();
       }
*/

        
        char ch ='A';
        int n=4;
        for(int line=1; line<=n; line++){
           for(int chars=1; chars<=line; chars++) {
              System. out.print(ch);
              ch++;
            }
            System.out.println();
       }
    }
}