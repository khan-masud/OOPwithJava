package ParameterizedMethod;

public class MainClass {
    public static void main(String[] args) {
        StudentClass student1 = new StudentClass();
        StudentClass student2 = new StudentClass();
        
        // Pass parameter to set method to set values
        student1.set("Abdullah Al Masud", "Khanpara, Sundarganj, Gaibandha, Rangpur", "01772901068", 21);
        
        
        // Pass parameter to set method to set values
        student2.set("Sayra Alom Maliha", "Sopnopur, Amanda, Orion Planet", "562535362", 20);
        
        // Display the students info
        System.out.println("Student data for student 1 : ");
        System.out.println("---------------------------");
        student1.display();
        
        System.out.println("Student data for student 2 : ");
        System.out.println("---------------------------");
        student2.display();
    }
}
