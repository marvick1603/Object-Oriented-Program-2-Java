package filescanner;

import content.Worker;
import content.WorkerFile;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileScanner {

    public static void main(String[] args) {
        try {
            Scanner k = new Scanner(System.in);
            System.out.println("Enter a file name ");
            String fileName = k.nextLine();
            File file = new File(fileName);

            if (!file.exists()) {
                throw new IOException("File not found ");
            }
            if (file.length() == 0) {
                throw new IOException("File is empty  ");
            }
            ArrayList<Worker> workerList = WorkerFile.getWorker(fileName);
            for (Worker worker : workerList) {
                System.out.println(worker.getName() + " has an ID of: " + worker.getID());
            }

        } catch (IOException e) {
            System.out.println(e);
        }

    }

}
