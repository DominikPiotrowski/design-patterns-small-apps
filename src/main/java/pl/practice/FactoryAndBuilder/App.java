package pl.practice.FactoryAndBuilder;

public class App {

    public static void main(String[] args) {

        //oczekiwane parametry:

        ComputerRequirement requirement1 = new ComputerRequirement();
        requirement1.setProcessorSpeed(1000);
        requirement1.setRam(Ram.RAM_32GB);

        //factory produkuje obiekt zgodny z oczekiwaniami (ify w factory)

        CompFactory factory = new CompFactory();
        IComputer created = factory.produce(requirement1);

        System.out.println("Compset produced: " + created.toString());
    }
}