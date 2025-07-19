package lab08;

import java.util.Scanner;

public class DateTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        while ((choice = getMenuChoice(input)) != 4) {
            try {
                Date date = null;

                switch (choice) {
                    case 1:
                        System.out.print("Enter Day of Month: ");
                        int day = input.nextInt();
                        System.out.print("Enter Month (1-12): ");
                        int month = input.nextInt();
                        System.out.print("Enter Year: ");
                        int year = input.nextInt();
                        date = new Date(day, month, year);
                        break;

                    case 2:
                        input.nextLine(); // consume leftover newline
                        System.out.print("Enter Month Name: ");
                        String monthName = input.nextLine();
                        System.out.print("Enter Day of Month: ");
                        day = input.nextInt();
                        System.out.print("Enter Year: ");
                        year = input.nextInt();
                        date = new Date(monthName, day, year);
                        break;

                    case 3:
                        System.out.print("Enter Day of Year: ");
                        int ddd = input.nextInt();
                        System.out.print("Enter Year: ");
                        year = input.nextInt();
                        date = new Date(ddd, year);
                        break;
                }

                if (date != null) {
                    System.out.println(date.toString());
                    System.out.println(date.toMonthNameDateString());
                    System.out.println(date.toDayDateString());
                }

            } catch (IllegalArgumentException ex) {
                System.out.println("Error: " + ex.getMessage());
            }

            System.out.println();
        }

        System.out.println("Program exited.");
    }

    public static int getMenuChoice(Scanner input) {
        System.out.println("Enter 1 for format (DD/MM/YYYY)");
        System.out.println("Enter 2 for format (MonthName DD, YYYY)");
        System.out.println("Enter 3 for format (DDD YYYY)");
        System.out.println("Enter 4 to exit");
        System.out.print("Pick your choice: ");
        return input.nextInt();
    }
}

