import java.util.Arrays;

public class Tester {

    // head , body 
    // access modifier  return type name(arguments )
    public static int max(int n1, int n2)
    {
        if(n1 > n2 )
            return n1; 
        else 
        return n2; 
    }

    public static double max(double n1, double n2)
    {
        if(n1 > n2 )
            return n1; 
        else 
        return n2; 
    }

    public static double max(int[] array )
    {
        int max = array[0];
         
        for(int curr: array){
            if(curr> max)
                max = curr; 
        }
        array[1] = 100;
        return max; 
    }

    public static void main(String[] args) {
        
        System.out.println(max(10,20));
        System.out.println(max(10.3,20.5));

        int[] array = {5,4,3,5};
        System.out.println( Arrays.toString(array));
        System.out.println(max(array));
        System.out.println( Arrays.toString(array));


    }
    
}
