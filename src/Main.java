import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get full name
        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine();

        // Get show date and convert to LocalDate
        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String dateInput = scanner.nextLine();
        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
        LocalDate showDate = LocalDate.parse(dateInput, inputFormat);

        // Get number of tickets
        System.out.print("How many tickets would you like? ");
        int ticketCount = scanner.nextInt();

        // Extract first and last name
        String[] nameParts = fullName.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[1];


        // Print confirmation message
        System.out.printf("%d tickets for %s reserved under %s, %s", ticketCount, showDate, lastName, firstName);

    }
}