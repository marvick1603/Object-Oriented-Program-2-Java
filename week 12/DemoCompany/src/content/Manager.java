/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package content;

/**
 *
 * @author jaini
 */
public class Manager extends Employee{

    public Manager(int ID) {
        super(ID);
    }

    @Override
    protected void calculatePay() {
    this.pay = 1000;    
    }
    
    
    
}
