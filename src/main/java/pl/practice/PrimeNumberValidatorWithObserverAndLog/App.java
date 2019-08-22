package pl.practice.PrimeNumberValidatorWithObserverAndLog;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        System.out.println("Please enter number: ");
        Scanner scanner = new Scanner(System.in);
        int intEntered = scanner.nextInt();

        PrimeNumObservator primeNumObservator = new PrimeNumObservator();
        primeNumObservator.notify(intEntered);
    }
}
