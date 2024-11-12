package StaticMethod;

public class Methods {
    
    int num1 = 10; // num1 is accessible for only non-static method. Beacause num1 is non-static
    static int num2 = 38; // num2 is accessible for only for static method. Because num2 is static
    
    void display() {
        // We can call any static method into a non static method
        display2();
        System.out.println("Num1 : " + num1);
        System.out.println("This is non static method.");
    }
    
    static void display2() {
        // We can't call any non static method into a static method
        System.out.println("Num2 : " + num2);
        System.out.println("This is static method.");
    }
    
}
