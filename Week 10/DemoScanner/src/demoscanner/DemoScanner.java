package demoscanner;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class DemoScanner {

    public static void main(String[] args) {
        try {
            File file = new File("Fred.dat");
            Scanner k = new Scanner(file);
            while (k.hasNext()) {
                int ID = k.nextInt();
                String name = k.next();
                System.out.println(name + "ID is: " + ID);
            }
        } catch (FileNotFoundException e) {
            System.err.println(e);
        }

    }

}
