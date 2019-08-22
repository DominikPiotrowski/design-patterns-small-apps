package pl.practice.FunctionalInterfaceAndAdapter2;

public class App {

    public static void main(String[] args) {

        Human human = new HumanImplement();

        SupermanToHumanAdapter supermanToHumanAdapter = new SupermanToHumanAdapter(human);
        SpidermanToHumanAdapter spidermanToHumanAdapter = new SpidermanToHumanAdapter(human);

        supermanToHumanAdapter.fly();
        supermanToHumanAdapter.laserEyes();

        spidermanToHumanAdapter.climb();
        spidermanToHumanAdapter.useWeb();
    }
}