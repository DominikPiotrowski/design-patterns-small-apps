package pl.practice.FunctionalInterfaceAndAdapter2;

public class HumanImplement implements Human{
    @Override
    public void walk() {
        System.out.println("Human walks. ");
    }

    @Override
    public void run() {
        System.out.println("Human runs. ");
    }
}
