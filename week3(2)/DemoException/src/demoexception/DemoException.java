
package demoexception;
public class DemoException {

    public static void main(String[] args) {
        try{
        double digit= Double.parseDouble(args[0]);
        if(digit<0){
            throw new Exception("negative number not allowed");
        }
            System.out.println("Digit:"+digit);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Missing Command Line Argument");
        }catch(NumberFormatException e){
            System.out.println("please enter number");
        }
        catch(Exception e){
            System.out.println("e is"+e);
            System.out.println("e.message"+e.getMessage());
        }
        finally{
            System.out.println("Completed");
        }
        
    }
    
}
