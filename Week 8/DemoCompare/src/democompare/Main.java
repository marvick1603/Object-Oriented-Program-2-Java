package democompare;

import content.Worker;

public class Main {
    public static void main(String[] args) {
        Worker one = new Worker(101);
        Worker two = new Worker(102);
        one.setName("Wilma");
      two.setName("Barney");
      
        if (one == two) {
            System.out.println("Same Worker");
        }
        System.out.println("one is " + one);
        System.out.println("two is " + two);
        
        System.out.println("Same Worker: "+one.equals(two));
        
    }
    
}