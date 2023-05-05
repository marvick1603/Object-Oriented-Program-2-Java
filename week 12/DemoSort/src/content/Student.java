package content;

public class Student implements Comparable<Student> {

    private int number;
    private int mark;

    public Student(int number) {
        this.number = number;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int compareTo(Student one) {

        if (this.mark < one.mark) {
            return 1;
        } else if (this.mark > one.mark) {
            return -1;
        } else {
            return 0;
        }
    }
}


