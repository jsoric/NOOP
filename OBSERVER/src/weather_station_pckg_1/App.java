package weather_station_pckg_1;

public class App {
    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation(9,77,1015);
        MobilePhoneWeatherApp mpwa1 = new MobilePhoneWeatherApp();
        mpwa1.setWeatherStation(weatherStation);
        MobilePhoneWeatherApp mpwa2 = new MobilePhoneWeatherApp();
        mpwa2.setWeatherStation(weatherStation);
        weatherStation.add(mpwa1);
        weatherStation.add(mpwa2);
        weatherStation.setStateWeatherData(1014,8,77);
    }
}
