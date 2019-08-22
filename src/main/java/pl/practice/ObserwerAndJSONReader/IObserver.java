package pl.practice.ObserwerAndJSONReader;

import java.io.IOException;
import java.util.List;

public interface IObserver {
    void notify(List list, int x) throws IOException;
}
