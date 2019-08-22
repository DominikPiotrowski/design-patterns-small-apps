package pl.practice.ActionFactory;

public class ActionA implements ITakeAction{
    @Override
    public void execute(String input) {
        System.out.println("Action A executed. ");
    }
}
