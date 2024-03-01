package problem2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class HeartRates {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public HeartRates(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    // Getter and setter methods for firstName, lastName, and dateOfBirth
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // Method to calculate age
    public int calculateAge() {
        LocalDate today = LocalDate.now();
        return Period.between(dateOfBirth, today).getYears();
    }

    // Method to calculate maximum heart rate
    public int calculateMaxHeartRate() {
        return 220 - calculateAge();
    }

    // Method to calculate and print target heart rate range
    public void printTargetHeartRateRange() {
        int maxHeartRate = calculateMaxHeartRate();
        int restingHeartRate = 70;
        double averageHeartRate = maxHeartRate - restingHeartRate;
        double lowerBoundary = 0.5;
        double upperBoundary = 0.85;

        double lowerBoundaryTargetHeartRate = (averageHeartRate * lowerBoundary) + restingHeartRate;
        double upperBoundaryTargetHeartRate = (averageHeartRate * upperBoundary) + restingHeartRate;

        System.out.println("Target Heart Rate Range:");
        System.out.printf("Lower Boundary: %.2f%n", lowerBoundaryTargetHeartRate);
        System.out.printf("Upper Boundary: %.2f%n", upperBoundaryTargetHeartRate);
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nDate of Birth: " + dateOfBirth +
                "\nAge: " + calculateAge() +
                "\nMaximum Heart Rate: " + calculateMaxHeartRate();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AgeCalculator ageCalculator = new AgeCalculator();

        System.out.println("Enter first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name:");
        String lastName = scanner.nextLine();
        LocalDate birthday = ageCalculator.getBirthday();

        HeartRates heartRates = new HeartRates(firstName, lastName, birthday);
        System.out.println("\nHeart Rates Information:");
        System.out.println(heartRates);
        System.out.println();
        heartRates.printTargetHeartRateRange();
    }
}


