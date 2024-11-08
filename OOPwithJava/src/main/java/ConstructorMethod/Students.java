package ConstructorMethod;

public class Students {
    String name, phone, address;
    int age;
    
    // Constructor
    Students (String n, String addrs, String phn, int a) {
        name = n;
        address = addrs;
        phone = phn;
        age = a;
    }
    
    // Constructor Overloading
    Students(String n, String addrs) {
        name = n;
        address = addrs;
    }

    Students() {
       // For empty objects
    }
   
   void display() {
       System.out.println("Name : " + name);
       System.out.println("Address : " + address);
       System.out.println("Phone Number : " + phone);
       System.out.println("Age : " + age);
       System.out.println("");
   } 
}
