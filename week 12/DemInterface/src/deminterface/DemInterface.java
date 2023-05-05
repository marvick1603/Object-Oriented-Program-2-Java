package deminterface;

import content.AChild;
import content.AParent;
import content.First;



public class DemInterface {
    //to project add a content folder that contains a class called Aparent.
    //add a public abstract method callead  stuff that does no take any parameters 
    // and return the string "This is stuff"
    // abstract methods cannot be implemented (have a body)
    // to content folder add a class called AChild that is a child calss of AParent
    // have AChild object use the stuff mehtod
    // to the content folder add an interface called first
    // add a public method called firststuff that 
    // does not take any parameters
    // return the strinf "this is "
    // have a child implement first 
    // note nned to implement the firststuff metod of first 
    // firststuff is abstract and public by default
    // add an ainterface clled second
    // to the second interface add apublic abstract method clled secondstuff
    // does nto take any parameter an return a String
    // hava a achild implement the second interface
    // need to override the secondstuff() method 
    // in main method have th AChild object use secondstuff()
    // note all variables in an interface are final must be assigned a value
    // which of the following can use NUM?
    // AChild clas  Achild object First interface  Second Interface Aparent Class 
    // in main use the first interface to change NUM to 20;
    // will not work NUm is automatcally final
    public static void main(String[] args) {
        
        AChild one = new AChild();
        System.out.println(one.stuff());
        System.out.println(one.firstStuff());
        System.out.println(one.secondStuff());
        
        System.out.println("AChild num is :" + AChild.NUM);
        System.out.println("One num is "+ one.NUM);
        System.out.println("First.num is " + First.NUM);
        //System.out.println("second num is "+ Second.NUM); does not work
        //System.out.println("AParent num is "+ AParent.NUM); does not work
        
        //First.num = 20 cannot work
    }

}
