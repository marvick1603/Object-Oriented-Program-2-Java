package content;

  /*Jinay Patel
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class EmployeeFile {

    public static LinkedList<Employee> setList(LinkedList<Employee> List) throws FileNotFoundException {
        Scanner fReader = new Scanner(new File("Employee.dat"));
        while (fReader.hasNextLine()) {
            String line = fReader.nextLine();
            StringTokenizer one= new StringTokenizer(line,",");
            String[] fields = new String[4];
            int i=0;
            while(one.hasMoreTokens()){
                fields[i]=one.nextToken();
                i++;
            }
            List.add(new Employee(Integer.parseInt(fields[0]), fields[1], fields[2], fields[3]));
        }
        return List;
    }

    public static void setFile(LinkedList<Employee> List) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("Employee.dat");
        Iterator<Employee> itList = List.iterator();
        while (itList.hasNext()) {
            Employee one = itList.next();
            pw.println(one.getId() + "," + one.getName() + "," + one.getCity() + "," + one.getPosition());
            pw.flush();
        }
        pw.close();
    }
}
