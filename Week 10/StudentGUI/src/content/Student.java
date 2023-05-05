package content;
public class Student {
    private int ID;
    private int marks;
    private String status;
    
    public Student(int ID){
        this.ID = ID;
    }

    public int getID() {
        return this.ID;
    }

    public int getMarks() {
        return this.marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getStatus() {
        calculateStatus();
        return this.status;
    }
    public void calculateStatus(){
        if(marks < 50){
            status = "Failed";
        }else {
            status = "Passed";
        }
    }
    
}
