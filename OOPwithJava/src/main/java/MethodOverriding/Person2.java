package MethodOverriding;

public class Person2 extends Person1{
    String name;
    int age;
    int phone;
    
    @Override // For Method Overriding
    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Phone Number : " + phone);
    }
}
