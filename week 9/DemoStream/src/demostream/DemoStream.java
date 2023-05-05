package demostream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoStream {

    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("Barney.dat"); // it create object that refrence barney.dat
            BufferedWriter bw = new BufferedWriter(fw); // it create bufferd object that refer filewiter
            bw.write("Hello Barney");           // it will send the string"hello barney" to barney.dat
            bw.flush();
            bw.write("Goodbye barney");
            bw.flush();
            bw.newLine();
            bw.write("\nHello Again");
            bw.flush();
            bw.close();
            fw.close();

            FileReader fr = new FileReader("Barney.dat"); // it crearte object that refer barney.dat
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine(); // it will read the first line of the Barney.dat
            while (line != null) {
            System.out.println(line);
            line = br.readLine();
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }

}
