
package demoarraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoArrayList {

    public static void main(String[] args) {

        ArrayList<String> nameList = new ArrayList<>();
          String[] cities={"Toronto","Hamilton","Brampton","Oakville"};
         
          nameList.addAll(Arrays.asList(cities));
          for(String city: nameList){
              System.out.println(city);
          }
          System.out.println(nameList.toString());
          System.out.println(nameList);
          nameList.add(1,"Burlington");
          System.out.println(nameList);
          nameList.remove(2);
          System.out.println(nameList);
          if(nameList.remove(args[0]))
              System.out.println("It has been removed");
          else
              System.out.println("not removed");
          
          
}
    
}
