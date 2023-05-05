/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm;

/**
 *
 * @author patel
 */
public class TheArray {
    public static int[] change(int a[]) {

        for (int sub = 0; sub < a.length; sub++) {

            a[sub] = sub;

        }

        return a;   

}
}
