package pl.practice.ObserwerAndJSONReader;

import java.io.IOException;

public class JsonReaderException extends RuntimeException{
    public JsonReaderException(String message, IOException e) {
        super(message, e);
    }
}
