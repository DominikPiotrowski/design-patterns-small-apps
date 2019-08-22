package pl.practice.ObserwerAndJSONReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class OutputLogWriter implements IObserver {
    @Override
    public void notify(List list, int x) {

        if (list != null) {
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(
                        "C:\\Users\\piotr\\IdeaProjects\\DesignPattersEx\\src\\main\\resources\\superhero.log",
                        true));
                bufferedWriter.write("Hero file was read on: " + new Date().toString()
                        + " Number of heroes:  " + list.size() + " Number of lines: " + x + "\n");
                bufferedWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}