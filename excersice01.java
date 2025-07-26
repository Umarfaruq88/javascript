import java.util.Scanner;

public class excersice01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input: Read three integers
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter third integer: ");
        int num3 = input.nextInt();

        // Calculations
        int sum = num1 + num2 + num3;
        double average = sum / 3.0;
        int product = num1 * num2 * num3;
        int smallest = Math.min(num1, Math.min(num2, num3));
        int largest = Math.max(num1, Math.max(num2, num3));

        // Output results
        System.out.println("\nResults:");
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Product: " + product);
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);

        input.close();
    }
}


