package demomethod;

import content.Employee;
import content.ProcessEmployee;

public class Main {
    public static void main(String[] args) {
        Employee one = ProcessEmployee.startEmployee();
        
        System.out.println("Employee's hours is: "+one.getHours());
        System.out.println("Employee's rate is: "+ one.getRate());
        
        System.out.println("one workes overtime: "+ ProcessEmployee.otEmployee(one));
       ProcessEmployee.byReference(one);
        System.out.println("rate: "+one.getRate());
        ProcessEmployee.byValue(45);
        System.out.println("rate: "+one.getRate());
    
    }
    
}
