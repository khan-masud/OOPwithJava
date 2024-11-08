package ConstructorMethod;

public class MainClass {
    public static void main(String[] args) {
        // Create and initialize the object using constructor
        Students student1 = new Students("Abdullah Al Masud", "Khanpara, Sundarganj, Gaibandha, Rangpur", "01772901068", 21);
        Students student2 = new Students("Sayra Alom Maliha", "Sopnopur, Amanda, Orion Planet", "562535362", 20);
        Students student3 = new Students(); // Empty object
        Students student4 = new Students("The Offline Dreamer", "Multiverse"); // Pass 3 values
        
        // Display the students info
        System.out.println("Student data for student 1 : ");
        System.out.println("---------------------------");
        student1.display();
        
        System.out.println("Student data for student 2 : ");
        System.out.println("---------------------------");
        student2.display();
        
        System.out.println("Student data for student 3 : ");
        System.out.println("---------------------------");
        student3.display();
        
        System.out.println("Student data for student 4 : ");
        System.out.println("---------------------------");
        student4.display();
        
    }
}
