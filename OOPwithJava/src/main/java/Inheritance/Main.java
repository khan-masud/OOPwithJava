package Inheritance;


public class Main {
    public static void main(String[] args) {
        Member member1 = new Member();
        
        member1.name = "Masud";
        member1.age = 22;
        member1.setAddress("Sundarganj, Gaibandha, Rangpur Bangladesh");
        member1.setPhone("01772901068");
        member1.setMemberID(62783);
        
        member1.memberInfo();
        
        // We can set these values via one method (Constructor). 
        Member member2 = new Member("The Offline Dreamer", 20, "Miller Planet", "01301677700",66782);
        
        // Print info
        System.out.println("\n\n");
        System.out.println("Info Added Via Constructor");
        System.out.println("----------------------------");
        member2.memberInfo();
    }
}
