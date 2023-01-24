import java.util.ArrayList;

public class StackTester {

    public static double sum(ArrayList<? extends Number> list){
        Double sum = 0.0; 
        
        for(Number curr: list){
            sum+= curr.doubleValue(); 
        }
        return sum;
    }


    

    // public static Integer sum(ArrayList<? extends Number> list){
    //     Integer sum = 0; 
    //     for(Number curr: list){
    //         sum+= curr.intValue(); 
    //     }
    //     return sum;
    // }


    // public static <T extends Number> Double sum(ArrayList<T> list){
    //     Double sum = 0.0; 
    //     for(T curr: list){
    //         sum+= curr.doubleValue(); 
    //     }
    //     return sum;
    // }

    public static void main(String[] args) {

        Number[] array = {10, 11, 12, 14, 10.4 , 10.6, 3.2 };

        ArrayList<Number> numberList = new ArrayList<>(); 
        //ArrayList<Double> doubleList = new ArrayList<Double>();

        for( Number curr: array){
            numberList.add(curr);
        }
        
        

        
        System.out.println(numberList.toString());
        System.out.println("Sum: " + sum(numberList));

        // System.out.println(doubleList.toString());
        // System.out.println("Sum: " + sum(doubleList));









        /* 
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        ArrayList<Double> doubleList = new ArrayList<Double>();
       

        // Integer list
        integerList.add(10);
        integerList.add(10);
        integerList.add(3);

        for(Number curr: integerList){
            System.out.println(curr);
        }

        System.out.println(sum(integerList));

        // Double list
        doubleList.add(10.4);
        doubleList.add(10.6);
        doubleList.add(3.2);

        // you can use the array list as normal array
        // for( int i =0; i< integerList.size(); i++){
        //     System.out.println(integerList.get(i));
        // }

        for(Number curr: doubleList){
            System.out.println(curr);
        }

        System.out.println(sum(doubleList));


        
*/




    }
}
