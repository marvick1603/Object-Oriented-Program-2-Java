package demoreference;

import content.Student;

public class Main {
    public static void main(String[] args) {
        Student one = new Student();
        Student two = new Student();
        
        one.setID(101);
        System.out.println("one's ID is: "+ one.getID());
        System.out.println("one is: "+one);
        
        two.setID(102);
        System.out.println("two's ID is: "+ two.getID());
        System.out.println("two is: "+two);
        
        one = two;
        System.out.println("one's ID is: "+ one.getID());
        System.out.println("one is: "+one);
        System.out.println("two's ID is: "+ two.getID());
        System.out.println("two is: "+two);
        
        one.setID(200);
        System.out.println("one's ID is: "+ one.getID());
        System.out.println("two's ID is: "+ two.getID());
    }
    
}
