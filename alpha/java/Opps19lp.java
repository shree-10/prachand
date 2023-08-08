//classes=>[school] group of these entities ;objects=>entities in the real world
//stack heap=>
//access modifiers
//private;default;protected;public
//getter & setters
//encapsulation=> wrapping data&methods in single unite capsule like( access specifier=> data hiding)
//inherition=>the properties&methods of base class are passed on to a derived class

//base class
class animal{
    String color;
    void eat() {
        System.out.println("eats");
    }

    void breadthe(){
        System.out.println("breathes");
    }
}
//extended  class
class fish extends animal{
    int fins;

    void swim(){
         System.out.println("swims in water");
    }
}
//abstraction=>
//polymorphem=>
//constructors=> types 1 non-parameterized
//                     2 parameterized
//                     3 copy constructors
//constructor overoading-> polymorphism
//shallow =>changes will reflected & deepend copy constructor
//destructors => garbage collector remove the empty space


public class Opps19lp {
    public static void main(String args[]) {
        // pen p1 = new pen();//creater pen object
        // p1.setColour("blue");
        // System.out.println(p1.color);
        // p1.setTip(5);
        // System.out.println(p1.tip);
        // BankAccount myAccount= new BankAccount();
        // myAccount.username = "shreeniwaschaudhari";
       // myAccount.Password =  "asdfghjkl"
       fish shark = new fish();
       shark.eat();
    }
}

// class BankAccount{
//    public String username; 
//    private String Password;
//    public void setPassword(String pwd){
//     Password = pwd;
//    }
// }
class pen{
    String color;
    int tip;

    void setColour(String newColour){
        color = newColour;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

class student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy,int chem,int math){
        percentage = (phy + chem + math);
    }
}

