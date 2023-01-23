package Generic.part1;

import java.util.Arrays;


public class Stack<T> {

    private T[] stack;
    private int index; 

    public Stack(T[] stack) {
        this.stack = stack;
        this.index = 0; 
    }

    public  void push(T item){
        // you should check the length before adding.
        stack[index] = item; 
        if(index+1 < stack.length )
            index++;
    }

    public T pop(){
        if(index-1 >=0 )
            index --; 
        
       // stack[index+1]= null; 
        return stack[index+1];
    }

    public T[] getStack() {
        return stack;
    }

    public void setStack(T[] stack) {
        this.stack = stack;
    }

    @Override
    public String toString() {


        return "Stack [stack=" + Arrays.toString(stack) + "]";
    }
 
}


