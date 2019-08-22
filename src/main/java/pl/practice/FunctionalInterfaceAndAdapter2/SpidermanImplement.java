package pl.practice.FunctionalInterfaceAndAdapter2;

public class SpidermanImplement implements Spiderman {
    @Override
    public void useWeb() {
        System.out.println("Spiderman uses web. ");
    }

    @Override
    public void climb() {
        System.out.println("Spidermn climbs buildings. ");

    }
}
