import java.io.Serializable;

public class GenericMethod {
    
 
    // public static <T> void printArray(T[] array){
    //     System.out.println("Array of T");
    
    //     System.out.print("[");
    //     for( T item : array){
    //         System.out.print(item);
    //     }
    //     System.out.println("]");
    // }

     /*What is really happing  */
    public static  void printArray(Object[] array){
        System.out.println("From Generic method");
        Object item_ = array[0]; 
        System.out.println(item_.getClass().getSimpleName());
        System.out.print("[");
        for( Object item : array){
            System.out.print(item +", ");
        }
        System.out.println("]");
    }


    // public static Integer max(Integer[] array){
    //     Integer max = array[0];

    //     for(Integer item: array){
    //         if ( item > max)
    //         max = item ; 
    //     }

    //     return max; 
    // }
    

    

    // public static Double max(Double[] array){
    //     Double max = array[0];

    //     for(Double item: array){
    //         if ( item > max)
    //         max = item ; 
    //     }

    //     return max; 
    // }

     
    
    public static <T extends Comparable> T max(T[] array){
        T max = array[0];

        for(T item: array){
            if ( item.compareTo( max) >0)
            max = item ; 
        }

        return max; 
    }
   


    
    


    public static void main(String[] args) {

        
        //  to do #1
        // Integer[] intArry = {1,2,3,4,5,6,7,8,};
        // Double[] doubleArray = {1.2, 2.1,3.2,4.4,5.2,6.0,7.2,8.9};
        // String[] stringArray = {"Hello", "Orang", "Apple"};

        // printArray(intArry);
        // printArray(doubleArray);
        // printArray(stringArray);
        
        
        
        //  todo #2
        Integer[] intArry = {1,2,3,4,5,6,7,8,};
        Double[] doubleArray = {1.2, 2.1,3.2,4.4,5.2,6.0,7.2,8.9};
        String[] stringArray = {"Hello", "Orang", "Apple"};

        printArray(intArry);
        System.out.println(max(intArry));
        printArray(doubleArray);
        System.out.println(max(doubleArray));
        printArray(stringArray);
        System.out.println(max(stringArray)); 

 




    }






    // public static <T> void printArray(T[] array){
    //     System.out.println("From Generic method");
    //     System.out.print("[");
    //     for( T item : array){
    //         System.out.print(item +", ");
    //     }
    //     System.out.println("]");
    // }

   

    // public static <T extends Comparable> T max(T[] array){
    //     /*
    //      * compateTo returns 
    //      *  0 if both objects are equal
    //      *  positive if object1 is greater than object2
    //      *  negative object1 is less than object2  
    //      */
    //     T max = array[0];
    //     for(T item : array){
    //         if(item.compareTo(max)>0)
    //             max = item; 
    //     }
    //     return max; 
    // }

    /* what is really happing */
    // public static Comparable  max(Comparable[] array){
        
    //     Comparable max = array[0];
    //     for(Comparable item : array){
    //         if(item.compareTo(max)>0)
    //             max = item; 
    //     }
    //     return max; 
    //}

}
