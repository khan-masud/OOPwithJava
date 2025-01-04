package Inheritance;

public class Person {
    String name;
    int age;
    private String phone;
    private String address;
    
    void personInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Phone : " + phone);
        System.out.println("Address : " + address);
    }
    
    // Setter method for phone
    void setPhone(String phone) {
        this.phone = phone;
    }
    
    // Setter method for address
    void setAddress(String address) {
        this.address = address;
    }
}
