public class UndreGraduate extends Student{

    int maxHours = 15;

    public UndreGraduate(String name, int age, int id, String major, int maxHours) {
        super(name, age, id, major);
        this.maxHours = maxHours;
    }


    @Override
    public  String toString(){
        return super.toString() +"\nMax Hours:" + maxHours;
    }
}
