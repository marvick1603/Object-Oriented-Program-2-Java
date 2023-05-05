/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demostring;

/**
 *
 * @author patel
 */
public class DemoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String s1="theString";
        System.out.println(s1.charAt(0));
        System.out.println(args[0].charAt(0));
       /** for(int i=0;i<args.length;i++)
        {
            System.out.println(args[i].charAt(0));
        }**/
        for(String arg :args){
             System.out.println(arg.charAt(0));
        }
        for(String arg :args){
             System.out.println(arg.charAt(arg.length()-1));
        }
        for(String arg :args){
             if(arg.indexOf("t")>0)
             {
                 System.out.println(arg);
             }
        }
    }
    
}
