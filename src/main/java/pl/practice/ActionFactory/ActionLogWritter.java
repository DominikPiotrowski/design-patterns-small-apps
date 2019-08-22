package pl.practice.ActionFactory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class ActionLogWritter {

    public void write(String file, String action) {

        try (BufferedWriter bf = new BufferedWriter(new FileWriter(file, true))) {
            bf.write("Action taken: " + action + " on: " + new Date().toString());
            bf.newLine();
            bf.flush();
            System.out.println("Action saved to log.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}