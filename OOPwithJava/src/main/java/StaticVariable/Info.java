package StaticVariable;

public class Info {
    String name;
    int studentID;
    String batch;
    String dept;
    static String university = "Dhaka International University";
    
    Info(String n, int ID, String b, String d) {
        name = n;
        studentID = ID;
        batch = b;
        dept = d;
    }
    
    void printInfo() {
        System.out.println("Name : " + name);
        System.out.println("Student ID : " + studentID);
        System.out.println("Batch : " + batch);
        System.out.println("Department : " + dept);
        System.out.println("University : " + university);
    }
}
