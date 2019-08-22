package pl.practice.PrimeNumberValidatorWithObserverAndLog;

public class PrimeNumObservator implements IObservator {

    @Override
    public void notify(Integer number) {
        boolean isPrime = true;

        for (int j = 2; j <= number / 2; j++) {
            int temp = number % j;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }

        LogWriterIsPrime logWriterIsPrime = new LogWriterIsPrime();

        if (isPrime) {
            logWriterIsPrime.write(
                    "C:\\Users\\piotr\\IdeaProjects\\DesignPattersEx\\src\\main\\resources\\logIsPrime.log");
            System.out.println("Number is prime. ");
        } else {
            System.out.println("Number is not prime. ");
        }
    }
}