package content;

public class ProcessEmployee {

    public static Employee startEmployee() {
        Employee two = new Employee();
        two.setHours(40);
        two.setRate(20);
        return two;
    }

    public static boolean otEmployee(Employee one) {
        return one.getHours() > 40;
        /*
        if(one.getHours()>40)
            return true;
        return false;
         */
    }

    public static void byValue(double rate) {
       rate = 10;
    }

    public static void byReference(Employee one) {
        one.setRate(30);
    }
}
