package Generic.part1;

public class StackTester {
    public static void main(String[] args) {

      
        





        
        Stack<Integer> intStack = new Stack<>(new Integer[5]);

        intStack.push(10);
        intStack.push(6);
        intStack.push(0);
        intStack.push(7);
        intStack.push(3);

        System.out.println(intStack);

        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack);


    }
}
