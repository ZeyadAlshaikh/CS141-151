public class Graduate extends Student{

    String researchTitle;

    public Graduate(String name, int age, int id, String major, String researchTitle) {
        super(name, age, id, major);
        this.researchTitle = researchTitle;
    }

    @Override
    public String toString() {
        return super.toString() +"\n Graduate{" +
                "researchTitle='" + researchTitle + '\'' +
                '}';
    }
}
