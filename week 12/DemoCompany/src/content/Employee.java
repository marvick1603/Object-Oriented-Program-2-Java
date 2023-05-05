package content;

public abstract class Employee {

//    private double pay;
protected double pay;
protected int ID;

protected Employee(int ID){
    this.ID = ID;
}

    public double getPay() {
        calculatePay();
        return this.pay;
    }

    protected abstract void calculatePay();
    
    

}
