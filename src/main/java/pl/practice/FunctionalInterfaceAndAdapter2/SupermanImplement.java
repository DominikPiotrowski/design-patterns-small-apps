package pl.practice.FunctionalInterfaceAndAdapter2;

public class SupermanImplement implements Superman {
    @Override
    public void fly() {
        System.out.println("Superman flyes. ");
    }

    @Override
    public void laserEyes() {
        System.out.println("Superman has laser eyes. ");
    }
}
