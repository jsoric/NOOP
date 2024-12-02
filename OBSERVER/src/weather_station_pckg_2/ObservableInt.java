package weather_station_pckg_2;

public interface ObservableInt {
    void addObserver(ObserverInt observerInt);
    void removeObserver(ObserverInt observerInt);
    void notifyAllObservers();
}