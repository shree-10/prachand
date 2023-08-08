public class operators8lp{
    public static void main(String args[]){
        //binary opperators
        int A = 10;
        int B = 5;
        System.out.println("ans "+ (A+B));
        System.out.println("ans "+ (A-B));
        System.out.println("ans "+ (A/B));
        System.out.println("ans "+ (A*B));
        System.out.println("ans "+ (A%B));
        // unary operators(++a ,a++)
        int b = --A;
        System.out.println(b);
        //relational operatoes(==,!=,>,<,<=,>=)
        int x =10;
        int y = 5;
        System.out.println((x==y));
        System.out.println((x!=y));
        System.out.println((x<y));
        System.out.println((x<y));
        System.out.println((x<=y));
        System.out.println((x<=y));
        //logical operators(&& and,|| or,!not)
        System.out.println( (3>2) && (5>2));
        System.out.println( (3>2) || (5>2));
        System.out.println( !(3>2) );
        //assigment operators
        int S = 10;
        //S = S +10;
        //S +=10;
        //S-=5;
        //S*=5;
        S/=5;
        System.out.println(S);

    }
}