import java.util.Scanner;

public class LeetcodeBank {
    
    // This method calculates the total money saved
    public static int totalMoney(int n) {

        int k = n / 7;          // Calculate the number of complete weeks

        int F = 28;        // Fixed amount saved in the first week

        int L = 28 + (k - 1) * 7;        // Amount saved in the last complete week

        int arithmeticSum = k * (F + L) / 2;        // Total amount saved in all full weeks

        int monday = 1 + k;            // Amount to start with on the Monday of the last (possibly incomplete) week

        int finalWeek = 0;              // Amount saved in the last incomplete week
        for (int day = 0; day < n % 7; day++) {
            finalWeek += monday + day;
        }

        return arithmeticSum + finalWeek;        // Total amount saved
    }

    // Main method to run the programm
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter the number of days Hercy has saved money:");
        int n = scanner.nextInt();

        // Call the totalMoney method and display the result
        System.out.println("Total money saved after " + n + " days: " + totalMoney(n));
    }
}
