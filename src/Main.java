import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


  Scanner INPUT = new Scanner(System.in);

  String secretPassword = "8"; //This is TERRIBLE security. Passwords should not be written/stored in the code.

        System.out.println("Welcome to the Secure Login Service.");
        System.out.print("\nPlease enter your username.\n>");
        INPUT.nextLine();  //Accepts input and ignores it.

        System.out.print("\nPlease enter your password.\n>");

        String attempt; // Declaration
        attempt = INPUT.nextLine(); //Assignment
                // OR, you can do both in one line
                // String attempt = INPUT.nextLine();


        if ( dumbestHashEver(attempt).equals( secretPassword ) ){
            System.out.println("Access Granted! You are a good person and people say nice things about you. ");
        }
        else {

            while(  ! dumbestHashEver(attempt).equals( secretPassword )) {
                System.out.print("Password is incorrect. Please try again.\n>");
                attempt = INPUT.nextLine();

            }

            //The only way to escape the loop is to get the correct password. So....
            System.out.println("Access Granted! You are a good person and people say nice things about you. ");

        }




    }

    public static String dumbestHashEver( String toBeHashed){
        //Dumb hash, just returns length as a string.
        int LENGTH;
        LENGTH = toBeHashed.length();

        return String.valueOf(LENGTH);

    }
}