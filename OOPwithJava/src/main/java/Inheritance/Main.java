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
        
        
         // Check intanceof 
         
         Person p = new Person();
         Member m = new Member();
         Commettee c = new Commettee();
         
         boolean isCinstanceOfMember = c instanceof Member;
         boolean isMinstanceOfPerson = m instanceof Person;
         boolean isPinstanceOfCommettee = p instanceof Commettee;
         boolean isCinstanceOfPerson = c instanceof Person;
         boolean isPinstanceOfMember = p instanceof Member;
         boolean isMinstanceOfCommettee = m instanceof Commettee;
         
         
         System.out.println("\n\n");
         System.out.println("Check Instance Result");
         System.out.println("----------------------------");
         System.out.println("Commettee instanceof Member : " + isCinstanceOfMember);
         System.out.println("Member instanceof Person : " + isMinstanceOfPerson);
         System.out.println("Person instanceof Commettee : " + isPinstanceOfCommettee);
         System.out.println("Commettee instanceof Person : " + isCinstanceOfPerson);
         System.out.println("Person instanceof Member : " + isPinstanceOfMember);
         System.out.println("Member instanceof Commettee : " + isMinstanceOfCommettee);
    }
    
}
