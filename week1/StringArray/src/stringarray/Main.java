
package stringarray;

public class Main {

    public static void main(String[] args) {
        String cities[]={"Toronto","Hamiliton","Oakville","Brampton"};
        System.out.println("First city is "+cities[0]);
        System.out.println("Last city is "+cities[3]);
        System.out.println("Length of String is "+cities.length);
        System.out.println("Last City is "+cities[(cities.length-1)]);
        for(String city : cities){
            System.out.println(city);
        }
        for(int i=0;i<cities.length;i++)
        {
            System.out.println(cities[i]);
        }
        int numbers[]=new int[5];
        for(int i=0;i<numbers.length;i++)
        {
            numbers[i]=i*2;
        }
        int j=0;
        while(j<numbers.length){
            System.out.println(numbers[j]);
            j++;
        }
        System.out.println(cities);
        System.out.println(numbers);
        
    }
    
}
