package weather_station_pckg_2;

import weather_station_pckg_1.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements ObserverInt {

    private float temperature;
    private float pressure;
    private float humidity;
    private final List<Observer> observers;

    public WeatherStation(float t, float h, float p){
        this.humidity = h;
        this.temperature = t;
        this.pressure = p;
        this.observers = new ArrayList<>();
    }


    @Override
    public void update(float t, float h, float p) {

    }

    @Override
    public void register(ObservableInt observableInt) {

    }

    @Override
    public void unregister(ObservableInt observableInt) {

    }
}