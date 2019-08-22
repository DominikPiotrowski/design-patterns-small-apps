package pl.practice.FunctionalInterfaceAndAdapter2;

public class SupermanToHumanAdapter implements Superman {
    private Human human;

    public SupermanToHumanAdapter(Human humanAdapted) {
        this.human = humanAdapted;
    }

    @Override
    public void fly() {
        this.human.walk();
    }

    @Override
    public void laserEyes() {
        this.human.run();
    }
}