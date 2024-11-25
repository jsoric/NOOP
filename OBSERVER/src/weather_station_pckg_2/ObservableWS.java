package weather_station_pckg_2;

import weather_station_pckg_1.Observer;

public interface ObservableWS {

    void add(Observer observer);
    void remove(Observer observer);
    void notifyAllObserver();
}

