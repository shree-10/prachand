import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:-");

        int num = sc.nextInt();

        //using the algo
        int rev = 0;
        while (num!=0) {
            rev = rev * 10 + num %10;
            num = num/10;
        }
        System.out.println("reverse Number is :-"+ rev);

        //using string buffer class
        
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();
        System.out.println("reverse Number is :-"+ rev);
       

        //using string builder
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        StringBuilder rev=sb.reverse();
        System.out.println("Reverse Number is:-"+rev);


    }
}
