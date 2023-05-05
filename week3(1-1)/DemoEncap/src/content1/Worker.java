
package content1;

public class Worker {
    private String name="Barney";
    private int number;
    public Worker()
    {
        this(100);
    }
    public int getnumber(){
        return this.number;
    }
    public Worker(int number){
        this.number=number;
    }
    public String getname()
    {
        return this.name;
    }
    public void setname(String name)
    {
       this.name=name;
    }
    
}
