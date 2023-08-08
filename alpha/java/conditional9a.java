import java .util.*;
public class conditional9a{
    public static void main(String args[]){
      /*  Scanner sc =new Scanner (System.in);
        int x= sc.nextInt();
        if(x>0){
            System.out.println("it is positive");
        }
        else{
            System.out.println("it is negitive");
        }
        
        double temp=103.5;
        if(temp > 100){
            System.out.println("You have a fever");
        }
        else{
            System.out.println("You don't have a fever");
        }


        Scanner sc= new Scanner(System.in);
        // Input week number from user 
        System.out.println("Enter week number(1-7): ");
        int week=sc.nextInt();
        switch(week) 
        {
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7: 
            System.out.println("Sunday");
            break;
            default:System.out.println("Invalidinput!Pleaseenterweeknumberbetween1-7.");
        }
        */

        Scanner sc =new Scanner(System.in);
        int year = sc.nextInt();
        if(year%4 == 0){
            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year");
        }

    }
}