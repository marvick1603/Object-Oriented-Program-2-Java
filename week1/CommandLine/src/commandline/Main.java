
package commandline;

public class Main {

    public static void main(String[] args) {
        System.out.println("Command Line Arguments is "+args[0]);
        for(int i=0;i<args.length;i++)
        {
            System.out.println(args[i]);
        }
        for(String arg :args){
            System.out.println(arg);
        }
    }
    
}
