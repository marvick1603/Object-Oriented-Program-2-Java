package demoprint;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DemoPrint {
    public static void main(String[] args) {
        PrintWriter one = new PrintWriter(System.out);
        one.println("Hello There");
        one.flush();
        //one.close();
        PrintWriter two = new PrintWriter(System.out, true);
        two.println("Automatic printing");
        try {
            PrintWriter three = new PrintWriter("Fred.dat");
            three.println("Hello Fred");
            three.close();

        } catch (FileNotFoundException e) {
            System.err.println(e);
        }

    }
    
}
