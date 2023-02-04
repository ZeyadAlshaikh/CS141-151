public class Tester {
    

    public static void main(String[] args) {
        try{
            System.out.println("Hello world!");
            double x = 10.0 /0.0;
            System.out.println(x);
        }catch(Exception e){
            e.printStackTrace();
            //System.out.println(e.toString());
        }finally{
            System.out.println("finally");
        }

        System.out.println("End of the program");
    }
}
