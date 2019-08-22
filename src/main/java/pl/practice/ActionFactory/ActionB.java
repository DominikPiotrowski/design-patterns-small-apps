package pl.practice.ActionFactory;

public class ActionB implements ITakeAction {
    @Override
    public void execute(String input) {
        System.out.println("Action B executed. ");
    }
}
