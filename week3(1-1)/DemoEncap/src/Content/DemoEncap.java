
package Content;

import content1.Worker;

public class DemoEncap {

    public static void main(String[] args) {
         Worker one= new Worker();
         System.out.println("one's name is:"+one.getname());
        one.setname("Tom");
        System.out.println("one's name is:"+one.getname());
        Worker two = new Worker(200);
        System.out.println("one's number is:"+one.getnumber());
        System.out.println("two's number is:"+two.getnumber());
        
    }
    
}
