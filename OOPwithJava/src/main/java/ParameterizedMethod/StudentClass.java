package ParameterizedMethod;

public class StudentClass {
    String name, phone, address;
    int age;
   
   void display() {
       System.out.println("Name : " + name);
       System.out.println("Address : " + address);
       System.out.println("Phone Number : " + phone);
       System.out.println("Age : " + age);
       System.out.println("");
   } 
   
   void set (String n, String addr, String phn, int a) {
       name = n;
       address = addr;
       phone = phn;
       age = a;
   }
}
