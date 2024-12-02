package weather_station_pckg_1;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements ObservableWS{

    private double temperature;
    private double pressure;
    private double humidity;
    private final List<Observer> observers;

    public WeatherStation(double t, double h, double p){
        this.humidity = h;
        this.temperature = t;
        this.pressure = p;
        this.observers = new ArrayList<>();
    }

    @Override
    public void add(Observer observer) {
        if(observers.contains(observer)){
            System.out.println("This one is already in observable list!");
        }else{
            observers.add(observer);
            System.out.println("New observer added to a list: " + observer);
        }
    }

    @Override
    public void remove(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
            System.out.println("This observer is successfully removed from the list!");
        }else{
            System.out.println("Can't remove the observer - not in the list!");
        }
    }

    public double getTemperature() {
        return temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    @Override
    public void notifyAllObservers() {
        if (observers.isEmpty()) {
            System.out.println("Nothing to notify!");
        }
        for(Observer observer : observers){
            observer.update();
        }
    }

    public void setStateWeatherData(double p, double t, double h){
        this.humidity = h;
        this.pressure = p;
        this.temperature = t;
        System.out.println("Weather data changed...");
        notifyAllObservers();
    }
}