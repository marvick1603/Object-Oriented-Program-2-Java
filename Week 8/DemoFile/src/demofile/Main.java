package demofile;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            File one = new File(args[0]);
            if (!one.exists()) {
                System.out.println(args[0] + " does not exist or cannot be found.");
            }
            if (one.createNewFile()) {
                System.out.println(args[0] + " has been created");

            }
            System.out.println("File name:" + one.getName());
            System.out.println("File path: " + one.getAbsolutePath());
            System.out.println("File length: " + one.length());
       } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" Miising Command Line Argument");
        } catch (IOException e) {
            System.out.println(" File not created");
        }
    }
}
