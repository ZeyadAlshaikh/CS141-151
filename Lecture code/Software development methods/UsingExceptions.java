

public class UsingExceptions {

public static void main(String[] args) {
    try {
        throwException();
    } catch (Exception e) {
        System.err.println("Exception handed in main");
    }

    doesNotThrowException();
}

private static void throwException()throws Exception {
    try {
        System.out.println("Method throwException");
        throw new Exception();

    } catch (Exception e) {
        System.err.println("Exception handel in method throwException");
        throw e; 
    }finally{
        System.err.println("finally Excuted in throwException");
    }
}

private static void doesNotThrowException() {

    try {
        System.out.println("Method doesNotThrowException");
    } catch (Exception e) {
        System.err.println(e);
    }finally{
        System.err.println("Finally excuted in doesNotThrowException");
    }

    System.out.println("End of method doesNotThrowException");
}


    
}
