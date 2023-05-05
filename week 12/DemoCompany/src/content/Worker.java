package content;


public class Worker extends Employee{
    private int hours = 40;
    private int rate = 20;
    public Worker (int ID){
        super(ID);
    }

    @Override
    protected void calculatePay() {
    this.pay = this.hours*this.rate;
    }
    
}
