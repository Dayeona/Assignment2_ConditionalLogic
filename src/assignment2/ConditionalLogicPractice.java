package assignment2;

import java.util.Scanner;

public class ConditionalLogicPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ---------------------------------------
        // Part 1: Test Score Average and Letter Grade
        // ---------------------------------------
        System.out.println("=== Part 1: Test Score Average and Grade ===");

        // Prompt the user to enter three test scores
        System.out.print("Enter score 1: ");
        int score1 = input.nextInt();

        System.out.print("Enter score 2: ");
        int score2 = input.nextInt();

        System.out.print("Enter score 3: ");
        int score3 = input.nextInt();

        // Calculate the average
        double average = (score1 + score2 + score3) / 3.0;

        // Determine the letter grade
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display results
        System.out.println("Scores entered: " + score1 + ", " + score2 + ", " + score3);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);


        // ---------------------------------------
        // Part 2: Bank Charges Calculator
        // ---------------------------------------
        System.out.println("\n=== Part 2: Bank Charges Calculator ===");

        // Prompt the user for number of checks
        System.out.print("Enter number of checks written: ");
        int numChecks = input.nextInt();

        // Base monthly fee
        double baseFee = 10.00;
        double feePerCheck;
        double totalFee;

        if (numChecks >= 0) {
            // Determine the per-check fee
            if (numChecks < 20) {
                feePerCheck = 0.10;
            } else if (numChecks < 40) {
                feePerCheck = 0.08;
            } else if (numChecks < 60) {
                feePerCheck = 0.06;
            } else {
                feePerCheck = 0.04;
            }

            // Calculate the total service charge
            totalFee = baseFee + (feePerCheck * numChecks);

            // Display the fees
            System.out.printf("Base fee: $%.2f\n", baseFee);
            System.out.printf("Fee per check: $%.2f\n", feePerCheck);
            System.out.printf("Total service charge: $%.2f\n", totalFee);
        } else {
            System.out.println("Invalid number of checks. Please enter 0 or greater.");
        }

        input.close();
    }
}
