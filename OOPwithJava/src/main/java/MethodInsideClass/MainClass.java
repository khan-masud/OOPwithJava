package MethodInsideClass;

public class MainClass {
    public static void main(String[] args) {
        StudentClass student1 = new StudentClass();
        StudentClass student2 = new StudentClass();
        
        // Initialization of student1
        student1.name = "Abdullah Al Masud";
        student1.address = "Khanpara, Sundarganj, Gaibandha, Rangpur";
        student1.phone = "01772901068";
        student1.age = 21;
        
        // Initialization of student2
        student2.name = "Sayra Alom Maliha";
        student2.address = "Sopnopur, Amanda, Orion Planet";
        student2.phone = "562535362";
        student2.age = 20;
        
        // Display the data of student
        System.out.println("Student data for student 1 : ");
        System.out.println("---------------------------");
        student1.display();
        
        System.out.println("Student data for student 2 : ");
        System.out.println("---------------------------");
        student2.display();
        
    }
}
