import java.util.Scanner; // Import the Scanner class to read user input

public class Addition{
    public static void main(String[] args) {
        // Create a Scanner object to read from the console
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for the first number
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        // Prompt user for the second number
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        // Calculate the sum using the + operator
        int sum = num1 + num2;
        
        // Display the final result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
