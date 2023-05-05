
package demoenum;

import content.Day;

/* create a project called demoenum
    2. to the project add a content folder that contains an enum called day.
    3.  to the day enum
        a. add a seven final dstatic consantts to represent the days of hte week
    4. use and enhanced for loop to print out hte name and oridinal value of the constants found in the day enum.
    5. in the main method print out
        a.DAY.friday
        b.Day.friday.name()
        c.Day.friday.oridinal
        d.Day.friday.toString()
    6. in the main method, demostare the use of 
        a. the equals method
        b. the compareto
    7. in the main method
        a. create a varialble to represent MONDAY
*/

public class DemoEnum {

   
    public static void main(String[] args) {
        
        for(Day d : Day.values()){
            System.out.println(d.name() + "  "+ d.ordinal());
        }
        
        System.out.println("Day.friday is : "+ Day.Friday);
        System.out.println("Day.friday.name() is : "+ Day.Friday.name());
        System.out.println("Day.friday.oridinal is : "+ Day.Friday.ordinal());
        System.out.println("Day.friday.tostring() is : "+ Day.Friday.toString());
        
        System.out.println("Day.friday.equals(Day.Monday())is " + Day.Friday.equals(Day.Monday));
        System.out.println("Day.friday.compareto(day.monday(()) is " +Day.Friday.compareTo(Day.Monday));
        
        Day day1 = Day.Monday; // created the variable to represent monday
        System.out.println("Day name is : "+ day1.name());
        System.out.println("day1 ordinal is :" + day1.ordinal());
    }
    
}
