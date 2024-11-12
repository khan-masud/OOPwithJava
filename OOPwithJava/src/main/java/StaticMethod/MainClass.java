package StaticMethod;

public class MainClass {
    public static void main(String[] args) {
        // To access the non static method we need to create a object first
        Methods nonStaticMethod = new Methods();
        nonStaticMethod.display();
        
        // To access static method, we don't need to create any object
        Methods.display2();
    }
}
