package demotoken;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        StringTokenizer one = new StringTokenizer("25 64");
        System.out.println(one.nextToken());
        System.out.println(one.nextToken());
        
        StringTokenizer two = new StringTokenizer(args[0]);
        while(two.hasMoreTokens()){
            System.out.println(two.nextToken());
        }
   }
    
}
