package OOPClass;

public class MainClass {
    public static void main(String[] args) {
        
        // Declaration and Creation of class
        Student student1 = new Student(); 
        Student student2 = new Student();
        
        student1.name = "Afiya Ferdous";
        student1.address = "Uttor Rajibpur, Gaibandha";
        student1.phone = "01798172770";
        student1.age = 21;
        
        // Info for student2
        student2.name = "Abdullah Al Masud";
        student2.address = "Khanpara, Gaibandha";
        student2.phone = "01772901068";
        student2.age = 21;
        
        // Print student info
        System.out.println("Name Of Student 1 : " + student1.name);
        System.out.println("Address Of Student 1 : " + student1.address);
        System.out.println("Phone Number Of Student 1 : " + student1.phone);
        System.out.println("Age Of Student 1 : " + student1.age);
        if (student1.age >= 18) {
            student1.marriageable = true;
        }
        System.out.println("Married Status : " + student1.marriageable + ". Buri kothakar.. biyer boyosh hoice kintu biye kore na...");
        
        System.out.println("Name Of Student 2 : " + student2.name);
        System.out.println("Address Of Student 2 : " + student2.address);
        System.out.println("Phone Number Of Student 2 : " + student2.phone);
        System.out.println("Age Of Student 2 : " + student2.age);
    }
}
