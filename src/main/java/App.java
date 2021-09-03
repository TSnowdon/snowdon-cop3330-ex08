import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Tyler Snowdon
 */
public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String firstInput;
        String secondInput;
        String thirdInput;
        int numPeople;
        int numPizzas;
        int numSlices;

        System.out.print("How many people? ");
        firstInput = reader.nextLine();
        System.out.print("How many pizzas do you have? ");
        secondInput = reader.nextLine();
        System.out.print("How many slices per pizza? ");
        thirdInput = reader.nextLine();
        try {
            numPeople = Integer.parseInt(firstInput);
            numPizzas = Integer.parseInt(secondInput);
            numSlices = Integer.parseInt(thirdInput);
        } catch (Exception e) {
            System.out.println("Invalid input! Please run the program again and try a different value.");
            return;
        }
        int totalSlices = numPizzas * numSlices;
        System.out.println(numPeople + " people with " + numPizzas + " pizzas" + " (" + totalSlices + " slices)");
        int eachSlice = totalSlices / numPeople;
        System.out.println("Each person gets " + eachSlice + " slices of pizza.");
        int leftOvers = totalSlices % numPeople;
        System.out.println("There are " + leftOvers + " leftover pieces.");
    }
}
