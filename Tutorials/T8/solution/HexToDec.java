

import java.util.Scanner;

public class HexToDec {
   
    
    public static int[] convertToInt(String hex) throws InvalidHexException{
       
        int[] ints = new int[hex.length()];
        char currChar;
        for (int i =0; i< hex.length(); i++) {
            currChar = hex.charAt(i);
            if (currChar >= '0' && currChar <='9') {
                ints[i] = currChar - '0';
            } else if (currChar >= 'a' && currChar <='f') {
                ints[i] = currChar - 'a' + 10;
            } else if (currChar >= 'A' && currChar <='F' ) {
                ints[i] = currChar - 'A' + 10;
            } else {
                throw new InvalidHexException(""+currChar);
            }

            
        }
        return ints; 
    }


    public static int  convertToDec(int[] ints){
        int result = 0;
        int mult = 1;    //multiplier
        for (int j = ints.length - 1; j >= 0; j--) {
            result += ints[j]*mult;
            mult *= 16;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Please enter a HEX string");
        Scanner input = new Scanner(System.in);
        String hex = input.next(); 
        int[] ints;

        try {
            ints = convertToInt(hex);
            System.out.println(convertToDec(ints));
        } catch (InvalidHexException e) {
           
            e.printStackTrace();
        }
        
    }
}
