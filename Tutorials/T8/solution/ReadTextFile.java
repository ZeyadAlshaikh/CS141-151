
import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile
{
   private static Scanner input;

   public static void main(String[] args)
   {
       openFile();
       readRecords();
       closeFile();
   } 

   // open file clients.txt
   public static void openFile()
   {
         input = new Scanner(Paths.get("clients.txt"));
   }

   // read record from file
   public static void readRecords()
   {
      System.out.printf("%-10s%-12s%-12s%10s%n", "Account",
         "First Name", "Last Name", "Balance");

     
      while (input.hasNext()) // while there is more to read
      {
         // display record contents
         System.out.printf("%-10d%-12s%-12s%10.2f%n", input.nextInt(),
           input.next(), input.next(), input.nextDouble());
      }
   } // end method readRecords

   // close file and terminate application
   public static void closeFile()
   {
      if (input != null)
         input.close();
   } 
} // end class ReadTextFile

/*************************************************************************
* (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
* Pearson Education, Inc. All Rights Reserved.                           *
*                                                                        *
* DISCLAIMER: The authors and publisher of this book have used their     *
* best efforts in preparing the book. These efforts include the          *
* development, research, and testing of the theories and programs        *
* to determine their effectiveness. The authors and publisher make       *
* no warranty of any kind, expressed or implied, with regard to these    *
* programs or to the documentation contained in these books. The authors *
* and publisher shall not be liable in any event for incidental or       *
* consequential damages in connection with, or arising out of, the       *
* furnishing, performance, or use of these programs.                     *
*************************************************************************/
