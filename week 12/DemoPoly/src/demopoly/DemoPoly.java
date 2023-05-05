package demopoly;

// add a content folder that contains
import content.BusinessStudent;
import content.ComputerStudent;
import content.Student;
import java.util.ArrayList;
import java.util.Iterator;

// a. student class
// b. computer studentclass that is a subclass of student
// c. businessstudent class  that is a subclass of student
// 3. to student class add a abstract method called display that 
//   a. does not atkae any parameters\
//   b. return a string
//   c. hava computer student display return "computer student"
//   d. have a businessstudent display return "business student"
// 4. in main, create a student refernce called ref
//    create a businessstudent object called one
//    create a computerstudent object called two
//    have student ref refernce object one 
//      i. use ref to call the display method
//    have student refernece object two 
//      i. use ref to call the display method
//    create an arraylist of student refernce called studentlist
//    add the two objects one and two to sthe studentlist
//    use an iterator to call the  display method if each rfeernce found in studenlist
// 5. to computer student class add a publi method called computer stuff that 
//    a. does not take any parameters 
//    b. returns the string "computer stuff"
//    c. which objects and ref can use computer stuff
public class DemoPoly {

    public static void main(String[] args) {
        Student ref;
        BusinessStudent one = new BusinessStudent();
        ComputerStudent two = new ComputerStudent();

        ref = one;
        System.out.println(ref.display());
        ref = two;
        System.out.println(ref.display());

        ArrayList<Student> studentlist = new ArrayList();
        studentlist.add(one);
        studentlist.add(two);

        Iterator<Student> iStudents = studentlist.iterator();
        while (iStudents.hasNext()) {
            System.out.println(iStudents.next().display());
        }

        //System.out.println(ref.computetStuff());
        //System.out.println(one.computetStuff());
        System.out.println(two.computerStuff());
        

    }

}
