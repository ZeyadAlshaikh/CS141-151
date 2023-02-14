// slightly updated version of: http://personales.unican.es/corcuerp/java/Labs/LAB_15.htm
import java.util.Scanner;

// This is my custom exception
class InvalidHexException extends RuntimeException {
    public InvalidHexException() { super(); }
    public InvalidHexException(String message) { super(message); }
    public InvalidHexException(String message, Throwable cause) { super(message, cause); }
    public InvalidHexException(Throwable cause) { super(cause); }
}

class HexToDec {
    
    // This method throws a custom exception called InvalidException
    static int [] convertToInt(String hex) //throws InvalidHexException
    {
        char currChar;
        int intEq[] = new int[hex.length()];
        for (int i = 0; i < hex.length(); i++) {
            currChar = hex.charAt(i);
            if (currChar >= '0' && currChar <='9') {
                intEq[i] = currChar - '0';
            } else if (currChar >= 'a' && currChar <='f') {
                intEq[i] = currChar - 'a' + 10;
            } else if (currChar >= 'A' && currChar <='F' ) {
                intEq[i] = currChar - 'A' + 10;
            } else {
                throw new InvalidHexException(""+currChar);
            }
        }
        return intEq;
    }
    
    static int convertToDec(int intEq[]) {
        int result = 0;
        int mult = 1;    //multiplier
        for (int j = intEq.length - 1; j >= 0; j--) {
            result += intEq[j]*mult;
            mult *= 16;
        }
        return result;
    }
    
    public static void main(String args[]) {
        String hex;
        int intEq[];
        Scanner input = new Scanner(System.in);
        
        
        try {
            // Receive hex value from a user
            System.out.print("Enter a hexadecimal string: ");
            hex = input.next();
            
            // convertToInt() method will throw InvalidHexExceptions if
            // the value is not in a valid format
            intEq = convertToInt(hex);
            
            Integer dec = new Integer(convertToDec(intEq));
            
            // Display the result
            System.out.println("The string in decimal: " + dec);
            
        } catch (InvalidHexException e) {
            e.printStackTrace();
        }
    }
}
