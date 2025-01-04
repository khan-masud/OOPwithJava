package MethodOverriding;

public class Main {
    public static void main(String[] args) {
        Person2 p2 = new Person2();
        p2.name = "Masud Khan";
        p2.age = 22;
        p2.phone = 123456789;
        
        p2.display();
        
        
        // Now object for person1
        System.out.println("\n\n");
        System.out.println("Information from Person1");
        System.out.println("-----------------------");
        Person1 p1 = new Person1();
        p1.name = "The Offline Dreamer";
        p1.age = 100;
        
        p1.display();
    }
}
