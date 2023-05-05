
package folder;

public class Employee {
    private int hours=40;
    private double rate =10;
    private double pay=400;
    public double getpay()
    {
        calculatePay();
        return this.pay;
    }
    public void setrate(double rate){
        this.rate=rate;
    }
    public void sethours(int hours){
        this.hours=hours;
    }
    private void calculatePay(){
        this.pay=this.hours*this.rate;
    }
    
}
