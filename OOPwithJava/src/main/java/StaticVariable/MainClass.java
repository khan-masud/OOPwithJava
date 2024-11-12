package StaticVariable;

public class MainClass {

    public static void main(String[] args) {
        Info s1 = new Info("Abdullah Al Masud", 125250, "D-93", "CSE");
        Info s2 = new Info("The Offline Dreamer", 62783, "D-150", "CSE");

        // Display Info
        s1.printInfo();
        s2.printInfo();
        
        // Access static variable
        // We can access static variable directly from class name. No need to create an object for this
        System.out.println("Total Student : " + Info.count);
        String masud = Info.university;
        System.out.println("Static Variable : " + masud);
        
        // Access non static variable
        // We can only access the non static variable from object name. You must create an object to access the no static variable.
        String masud2 = s1.batch;
        System.out.println("Non Static Variable : " + masud2);
    }
}
