package ReturningValue;

public class MainClass {
    public static void main(String[] args) {
        ReturnValue object = new ReturnValue(); // Create object for class
        
        int returnedValue = object.squre(5);
        System.out.println("Returned Value : " + returnedValue);
    }
}
