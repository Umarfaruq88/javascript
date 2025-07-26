import java.util.Scanner;

public class excersice02 {

        Scanner input = new Scanner(System.in);

        // Ask user for a five-digit number
        System.out.print("Enter a 5-digit number: ");
        int number = input.nextInt();

        // Separate each digit
        int digit1 = number / 10000;
        int digit2 = (number / 1000) % 10;
        int digit3 = (number / 100) % 10;
        int digit4 = (number / 10) % 10;
        int digit5 = number % 10;

        // Print digits separated by three spaces
        System.out.println(digit1 + "   " + digit2 + "   " + digit3 + "   " + digit4 + "   " + digit5);

        input.close();
    }
}
