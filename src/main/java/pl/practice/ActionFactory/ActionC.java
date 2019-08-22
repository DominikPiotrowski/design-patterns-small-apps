package pl.practice.ActionFactory;

public class ActionC implements ITakeAction {
    @Override
    public void execute(String input) {
        System.out.println("Action C executed. ");
    }
}
