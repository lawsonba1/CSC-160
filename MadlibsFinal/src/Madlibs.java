import java.util.Scanner;  // Import the Scanner class

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object


        System.out.println("Please enter a noun.");
        String noun1 = myObj.nextLine();  // Read user input
        System.out.println("Thanks! Now, please enter a adjective.");  // Output user input
        String adj1 = myObj.nextLine();

        System.out.println("You are a " +adj1 +noun1);
    }
}