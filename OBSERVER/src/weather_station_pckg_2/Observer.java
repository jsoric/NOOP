package weather_station_pckg_2;

import weather_station_pckg_1.ObservableWS;

public interface Observer {
    void update(double t, double p, double h);
    void register(ObservableWS observableWS);
    void uregister(ObservableWS observableWS);
}
