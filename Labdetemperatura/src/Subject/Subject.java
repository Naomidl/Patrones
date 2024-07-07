package Subject;

import Observer.Observer;

public interface Subject {
    void addObserver(Observer observador);
    void removeObserver(Observer observvador);
    void notifyObservers(int temperature);
}
