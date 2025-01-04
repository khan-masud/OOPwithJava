package Inheritance;

public class Member extends Person{
    // Person is super class, parent class, base class
    // Member is sub class, child class, derived class
    
    /*
        Accessiable Varibale and Methods of Person Class
            1. name
            2. age
            3. personInfo()
            4. setPhone()
            5. setAddress()
    
        'phone' and 'address' can't be access from sub or child class because they are private.
    
    */
    
    private int memberID;


    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }
    
    
    void memberInfo() {
        personInfo();
        System.out.println("Membership ID : " + memberID);
    }
    
    Member(String name, int age, String phone, String address, int memberID) {
        this.name = name;
        this.age = age;
        setPhone(phone);
        setAddress(address);
        this.memberID = memberID;
    }
    
    Member() {
        
    }
    
    
}
