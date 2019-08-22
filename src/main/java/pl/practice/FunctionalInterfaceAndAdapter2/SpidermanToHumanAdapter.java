package pl.practice.FunctionalInterfaceAndAdapter2;

public class SpidermanToHumanAdapter implements Spiderman {
    private Human human;

    public SpidermanToHumanAdapter(Human humanAdapted) {
        this.human = humanAdapted;
    }

    @Override
    public void useWeb() {
        this.human.walk();
    }

    @Override
    public void climb() {
        this.human.run();
    }
}
