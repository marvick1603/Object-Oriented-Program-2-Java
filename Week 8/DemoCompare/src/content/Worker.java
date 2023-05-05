package content;

public class Worker {

    private int ID;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Worker(int Id) {
        this.ID = Id;
    }

    public int getId() {
        return ID;
    }
//    public boolean equals(Worker one){
//        if(this.ID == one.ID){
//            return true;
//        }
//        return false;
//    }

    public boolean equals(Object one) {
        if (one instanceof Worker) {
            if (this.ID == ((Worker) one).ID) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        return this.name + "has an ID of :"+ this.ID;
    }
}