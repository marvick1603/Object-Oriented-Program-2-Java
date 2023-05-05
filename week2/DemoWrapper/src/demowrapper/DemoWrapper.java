
package demowrapper;

public class DemoWrapper {

    public static void main(String[] args) {
       String stin=args[0];
       String sDouble=args[1];
       String sTotal=stin+sDouble;
        
       System.out.println(stin);
         System.out.println(sDouble);
         System.out.println(sTotal);
         
         int number=Integer.parseInt(stin);
         double digit=Double.parseDouble(sDouble);
         Double total=number+digit;
         
        
         System.out.println(total);
        
         String s1=Integer.toString(number);
         String s2=Double.toString(digit);
         String sSum=s1+s2;
         
         System.out.println(sSum);
       
    }
    
}
