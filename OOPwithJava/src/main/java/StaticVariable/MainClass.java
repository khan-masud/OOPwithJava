package StaticVariable;

public class MainClass {

    public static void main(String[] args) {
        Info s1 = new Info("Abdullah Al Masud", 125250, "D-93", "CSE");
        Info s2 = new Info("The Offline Dreamer", 62783, "D-150", "CSE");

        // Display Info
        s1.printInfo();
        s2.printInfo();
    }
}
