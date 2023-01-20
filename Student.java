import java.util.Scanner;

public class Student extends  Person{
    private  String major ;// composition
    private int id;

    public Student(String name, int age, int id, String major) {
        super(name, age);
        //System.out.println("Student constructor");
        this.major = major;
        this.id = id;
    }


    public void setMajor(String major) {
        this.major = major;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMajor() {
        return major;
    }


    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return super.toString() + "\nStudent{" +
                "major='" + major + '\'' +
                ", id=" + id +
                '}';
    }
}