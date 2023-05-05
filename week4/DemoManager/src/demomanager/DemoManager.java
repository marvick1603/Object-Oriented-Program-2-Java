/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demomanager;
import content.Manager;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author patel
 */
public class DemoManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner k = new Scanner(System.in);
        ArrayList<Manager> workerList = new ArrayList<>();
        
        boolean isMore=true;
        while(isMore){
            System.out.println("Enter Manager No:");
            int no=k.nextInt();
             Manager Mone =new Manager(no);
             System.out.println("Enter Pay:");
             double mpay=k.nextDouble();
             Mone.setpay(mpay);
             workerList.add(Mone);
            System.out.println("ENTER -1 to continue:");
            int c=k.nextInt();
            if(c!=-1){
                isMore=false;
            }
        }
        for(Manager m: workerList){
            System.out.println("No:"+m.getnumber()+"Pay:"+m.getpay());
        }
        
        
    }
    
}
