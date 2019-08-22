package pl.practice.FunctionalInterfaceAndAdapter;

public class CarToBoatAdapter implements Boat{
    private Car car;

    public CarToBoatAdapter(Car adaptedCar) {
        this.car = adaptedCar;
    }

    @Override
    public void swim() {
        this.car.drive();
    }
}
