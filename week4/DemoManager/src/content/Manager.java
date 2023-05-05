/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package content;

/**
 *
 * @author patel
 */
public class Manager {
    private int number ;
    private double pay;
    public Manager(int number){
        this.number=number;
    }
    public int getnumber(){
       return this.number;
       
    }
    public void setpay(double pay){
        this.pay=pay;
    }
    public double getpay(){
        return this.pay;
    }
}
