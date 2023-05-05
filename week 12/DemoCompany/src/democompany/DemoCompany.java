package democompany;

// to the project add a content folder that contins s class called Employee

import content.Employee;
import content.Manager;
import content.SalesPerson;
import content.Worker;
import java.util.ArrayList;

// 3. to employee class
//    a. protected double pay tht has a get method
//    b. protected int ID that
//       i. is set by a parameter of a protected constructor
//    c. protected abstract method called claculatepay that\
//       i. does not take parameters
//       ii. does not return anything
//       iii. is called in the getpay
// 4. to the content folder add apublic class manager that
//     a. is a child class of employee
//     b.  uses calculatepay to set pay to 1000.
//     c. what would happens if pay iin employee was private 
// 5.  to the content folder add a public class called worker that 
//     a. is a child class of employee 
//     b. has a private int called hours set to 40.
//     c. has a private int rate set to 20;
//     d. uses calculatepay to set pay = hours*rate;
// 6. to the content add an interface called commission that 
//     a. has a double called rate set to 0.10
// 7. to the content add public class called SalesPerson that 
//    a, is a child class of employee
//    b. implements the commission interface
//    c. has a private int sales set to 10000
//    d. uses calculateooay to set oay = sales* commission.Rate
// 8. in main 
//    a. create a manage object 
//    b. create a worker object
//    c. create a salesperson object
//    d. add the above three objects to an arraylist fo employee refernces
//    e. print out the pau of all objects iint the arraylist
public class DemoCompany {

    public static void main(String[] args) {
        Manager one = new Manager(101);
        Worker two = new Worker(102);
        SalesPerson three = new SalesPerson(103);
        
        ArrayList<Employee> employeelist = new ArrayList();
        employeelist.add(one);
        employeelist.add(two);
        employeelist.add(three);
        
        for(Employee employee : employeelist){
            System.out.println(employee.getPay());
        }
        
        

    }
    
}
