package demosort;

import content.Student;
import java.util.ArrayList;
import java.util.Collections;

public class DemoSort {

    // 2 add a content folder called student class
    // 3 to student class add a private 
    //    a. integer number that is set by constructor parameter and has a get method
    //    b. integer mark that has a get and set method
    // 4 in main method 
    //    a. create three student objects, with differernt numbers and marks
    //    b. add the three student object to arraylist
    //    c. print out the number and mark of each student found int the arraylist
    // 5  have the student class implement the comparable interface
    //    a. have the compareto method sort the student object from largest to smallest mark
    public static void main(String[] args) {

        Student one = new Student(101);
        one.setMark(55);
        Student two = new Student(102);
        two.setMark(65);
        Student three = new Student(103);
        three.setMark(75);

        ArrayList<Student> studentList = new ArrayList();
        studentList.add(one);
        studentList.add(two);
        studentList.add(three);

        for (Student student : studentList) {
            System.out.println(student.getNumber() + " Mark is : " + student.getMark());
        }
        Collections.sort(studentList);
        for (Student student : studentList) {
            System.out.println(student.getNumber() + " Mark is : " + student.getMark());
        }

    }

}
