

public class Student extends Person{

    private String major; 

    public Student(String name, int age, String id, DateOfBirth dob,String major){
        super(name, age, id,dob);
        this.major = major; 
        
    }
    public Student(Person p1, String major ){
        super(p1);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void doSomthing(){
        System.out.println("[Student] doing somthing"+ name);
    }

    @Override
    public String toString() {
        return super.toString()+ "\nStudent [major=" + major + "]";
    }

    
    
    
}
