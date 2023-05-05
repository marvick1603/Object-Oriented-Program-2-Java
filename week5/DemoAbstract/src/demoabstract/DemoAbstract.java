/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demoabstract;

import content.AChild;
import content.BChild;
import content.GrandChild;

/**
 *
 * @author patel
 */
public class DemoAbstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      //  Aparent one= new Aparent();
      AChild one = new AChild();
        System.out.println(one.stuff());
        System.out.println(one.printstuff());
        
        BChild two =new BChild();
        System.out.println(two.stuff());
        System.out.println(two.printstuff());
        
        GrandChild three=new GrandChild();
        System.out.println(three.stuff());
        System.out.println(three.printstuff());
    }
    
}
