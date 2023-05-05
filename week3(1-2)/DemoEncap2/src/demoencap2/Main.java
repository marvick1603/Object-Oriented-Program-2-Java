
package demoencap2;

import folder.Employee;

public class Main {

    public static void main(String[] args) {
        /**
         *hello
         *@return pay of Employee
         **/
        Employee one =new Employee();
        System.out.println("one's pay is:"+one.getpay());
        one.sethours(50);
        System.out.println("one's pay is:"+one.getpay());
        
    }
    
}
