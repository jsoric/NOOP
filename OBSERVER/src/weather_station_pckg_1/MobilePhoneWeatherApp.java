package weather_station_pckg_1;

public class MobilePhoneWeatherApp implements Observer, Display{

    private double temp;
    private double press;
    private double hum;
    private WeatherStation weatherStation;

    public void setWeatherStation(WeatherStation weatherStation){
        this.weatherStation = weatherStation;
    }

    @Override
    public void display() {
        System.out.println("Displaying: ");
        System.out.println(temp + " C degree");
        System.out.println(hum + "%");
        System.out.println(press + "pascals" );
    }

    @Override
    public void update() {
        this.press = weatherStation.getPressure();
        this.hum = weatherStation.getHumidity();
        this.temp = weatherStation.getTemperature();
        System.out.println("All is updated!!!");
        System.out.println(Integer.toHexString(this.hashCode()) + "@" + getClass().getSimpleName());
        display();
    }
}