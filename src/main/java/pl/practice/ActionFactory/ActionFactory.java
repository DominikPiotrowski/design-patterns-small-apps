package pl.practice.ActionFactory;

public class ActionFactory {
    public ITakeAction produce(String input) {

        if (input.equals("A")) {
            return new ActionA();
        }
        if (input.equals("B")) {
            return new ActionB();
        }
        if (input.equals("C")) {
            return new ActionC();
        }
        return null;
    }
}