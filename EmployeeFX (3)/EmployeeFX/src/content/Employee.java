package content;
/*Jinay Patel
*/
public class Employee {

    private int ID;
    private String name;
    private String city;
    private String position;

    public Employee(int ID, String name, String city, String position) {
        this.ID = ID;
        this.name = name;
        this.city = city;
        this.position = position;
    }

    public void setId(int ID) {
        this.ID = ID;
    }

    public int getId() {
        return this.ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return this.position;
    }
}
