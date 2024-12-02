package weather_station_pckg_1;

public interface ObservableWS {

    void add(Observer observer);
    void remove(Observer observer);
    void notifyAllObservers();
}
