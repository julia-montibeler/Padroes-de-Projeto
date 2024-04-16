import java.util.ArrayList;

public interface Subject {

    ArrayList<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer o);
    public void notifyObservers();
    public void removeObserver(Observer o);
}
