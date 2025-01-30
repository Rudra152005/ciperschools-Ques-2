import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Accept the total cart amount as input from the user
        System.out.print("Enter the total cart amount: ₹");
        double totalAmount = scanner.nextDouble();

        // Declare variables for discount and final amount
        double discount = 0.0;
        double finalAmount;

        // Calculate discount based on the total amount
        if (totalAmount > 5000) {
            discount = totalAmount * 0.20; // 20% discount
        } else if (totalAmount >= 3000) {
            discount = totalAmount * 0.10; // 10% discount
        } else {
            discount = 0.0; // No discount
        }

        // Calculate the final amount after discount
        finalAmount = totalAmount - discount;

        // Display the discount and final amount in a user-friendly format
        System.out.printf("Discount: ₹%.2f%n", discount);
        System.out.printf("Final Amount: ₹%.2f%n", finalAmount);

        // Close the scanner
        scanner.close();
    }
}