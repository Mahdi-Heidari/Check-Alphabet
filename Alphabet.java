package alphabet;

import java.util.Scanner;

public class Alphabet {

    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character:\t");
        char ch = input.next(".").charAt(0);

//        Check Alphabet using if-else statement
        //        For more readability it's better to write the if statement as follows:
        //        if (   (ch>='A' && ch<='Z') || (ch>='a' && ch<='z')    ) 
        if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
            System.out.printf("[%c] is an alphabet!", ch);
        } else {
            System.out.printf("[%c] is not an alphabet!", ch);
        }

//        Check Alphabet using ternary operator
        /*
         String output = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') 
         ? String.format("[%c] is an alphabet!", ch) : String.format("[%c] is not an alphabet!", ch);

         System.out.println(output);
         */
        
        System.out.println("\n");
    }

}
