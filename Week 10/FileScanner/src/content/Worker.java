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

    public int getID() {
        return ID;
    }

    public Worker(int ID) {
        this.ID = ID;
    }
}

