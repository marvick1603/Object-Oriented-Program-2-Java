/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package democonstructor;

import content.ConChild;
import content.ConParent;

/**
 *
 * @author patel
 */
public class DemoConstructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConParent one= new ConParent("hello world");
        System.out.println(one.getname());
        ConChild two =new ConChild();
        System.out.println(two.getname());
        ConChild three=new ConChild("Fred");
        System.out.println(three.getname());
        ConParent four=new ConParent();
        System.out.println(four.getname());     
        
                
                
    }
    
}
