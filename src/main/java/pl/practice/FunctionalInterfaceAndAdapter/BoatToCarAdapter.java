package pl.practice.FunctionalInterfaceAndAdapter;

public class BoatToCarAdapter implements Car{
    private Boat boat;

    public BoatToCarAdapter(Boat adaptedBoat) {
        this.boat = adaptedBoat;
    }

    @Override
    public void drive() {
        this.boat.swim();
    }
}
