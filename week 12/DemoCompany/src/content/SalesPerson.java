/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package content;

/**
 *
 * @author jaini
 */
public class SalesPerson extends Employee{
    
    private int sales = 1000;

    public SalesPerson(int ID) {
        super(ID);
    }

    @Override
    protected void calculatePay() {
        this.pay= this.sales*Commission.RATE;
    }

 
}
