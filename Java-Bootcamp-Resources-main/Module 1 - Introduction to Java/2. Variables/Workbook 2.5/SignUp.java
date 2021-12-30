import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");
        


        System.out.println("\nPlease provide your first name: ");
        String firstname = scan.nextLine();

        System.out.println("\nPlease provide your last name: ");
        String lastname = scan.nextLine();

        System.out.println("\nHow old are you?");
        int age = scan.nextInt();
        
        System.out.println("\nWhich city do you live in?");
        scan.nextLine();
        String city = scan.nextLine();
        
        System.out.println("\nWhich country is that in?");
        String country = scan.nextLine();

        System.out.println("\nPlease create your username:");
        String username = scan.nextLine();


        //Task 2 - Print their information. 

        System.out.println("\nThank you for joining JavaGram!");

        //Print their information like so:

        // Your information:
        //        First Name: Rayan
        //        Last Name: Slim
        //        Age: 27
        //        Username: monotonic_relu
        //        City: Ottawa
        //        Country: Canada
        //

        System.out.println("\n\nYour information: ");
        System.out.println("\tFirst Name: " + firstname);
        System.out.println("\tLast Name: "  + lastname);
        System.out.println("\tAge: " + age);
        System.out.println("\tUsername: " + username);
        System.out.println("\tCity: " + city);
        System.out.println("\tCountry: " + country);

        scan.close();
        //close scanner. It's good practice :D ! 
    }
}