package pl.practice.ActionFactory;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        System.out.println("Please enter prefered action: 'A','B','C");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ActionFactory actionFactory = new ActionFactory();
        actionFactory.produce(input).execute(input);

        ActionLogWritter actionLogWritter = new ActionLogWritter();
        actionLogWritter.write(
                "C:\\Users\\piotr\\IdeaProjects\\DesignPattersEx\\src\\main\\resources\\action.log",input);
    }
}