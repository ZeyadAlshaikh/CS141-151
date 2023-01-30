import java.util.ArrayList;

public class Util {
   
    public static  <P extends Pair> boolean compare(P p1, P p2){
        if( p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue()))
        return true;
        return false; 

    }

    public static <T extends Comparable<T>>  int countGreaterThan(T[] array, T e){
        int count = 0; 

        for ( T element: array){
            if(element.compareTo(e)> 0)
            count++;
        }

        return count; 
    }
}
