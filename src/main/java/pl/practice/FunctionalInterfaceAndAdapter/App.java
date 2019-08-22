package pl.practice.FunctionalInterfaceAndAdapter;

public class App {

    public static void main(String[] args) {

        //nowa instancja i adapter na tej instancji
        //wywołuje metodę z klasy car mimo że to boat

        Boat boat = () -> System.out.println("Boat can drive. ");
        BoatToCarAdapter boatToCarAdapter = new BoatToCarAdapter(boat);
        boatToCarAdapter.drive();

        Car car = () -> System.out.println("Car can swim. ");
        CarToBoatAdapter carToBoatAdapter = new CarToBoatAdapter(car);
        carToBoatAdapter.swim();
    }
}