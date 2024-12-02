package weather_station_pckg_2;

public interface ObserverInt {
    void update(float t, float h, float p);
    void register(ObservableInt observableInt);
    void unregister(ObservableInt observableInt);
}
