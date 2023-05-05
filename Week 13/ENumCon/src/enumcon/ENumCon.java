
package enumcon;

import content.Coin;
import java.util.Scanner;

/** create a project called ENumcon
 *  2. to the project add acontent folder tht contains an enum called coin
 *  3. to enum coin add five static finial constants
 *      a. NICKEL with values 5, nickel made of nickel
 *      b.DIME with the values 10, dime mad of tin
 *      c. QUATER with values 25 quater made of silver
 *      d. LOONIE with value of 100 loonie mad of copper
 *      e. twoonie with calue of 200 toonie made of bronze
 *  4. to enum Coin, add three private final variables 
 *      a. int cents, string coinName string desvription
 *      b. all three have get methods
 *  5. to enum coin add private constructor that takes three parameters
 *      a. int cents string coinName string description
 *      b. all three parameters are set to their appropiate variable
 *  6. in main method
 *      a. uses enhanced for loop to print out the cents coinanme and desvription of all coins (coin.values)
 *      b. create a coin array using coin.value
 *      c.prompt the user to type int a number 0,1,2,3
 *      d. print out the coin name and cents of the coin chosen by the user
 */
public class ENumCon {

    
    public static void main(String[] args) {
        
        for(Coin c : Coin.values()){
            System.out.println(c.getCoinName()+" is worth "+ c.getCents()+" description "+ c.getDescription());
        }
        
        Coin coins[] = Coin.values();
        
        Scanner k = new Scanner(System.in);
        System.out.println("choose one of the following coin: ");
        int  choice = k.nextInt();
        System.out.println("you have choosen :"+ coins[choice]+"worth"+ coins[choice].getCents() + "cents");
       
    }
    
}
