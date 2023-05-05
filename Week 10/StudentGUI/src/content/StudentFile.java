package content;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedList;

public class StudentFile {

    public static void saveStatus(LinkedList<Student> studentList)
            throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("Student.dat");

        for (Student student : studentList) {
            pw.println(student.getID() + " " + student.getStatus());
        }
        pw.close();
    }
}
