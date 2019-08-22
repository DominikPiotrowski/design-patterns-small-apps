package pl.practice.ObserwerAndJSONReader;

public class App {
    public static void main(String[] args) {
        JsonReader jsonReader = new JsonReader();
        jsonReader.read("C:\\Users\\piotr\\IdeaProjects\\DesignPattersEx\\src\\main\\resources\\superhero.json");
    }
}