package imt.nordeurope.j2ee.tp.nickler.tp1.servlets.beans;

public class WeatherBean {

    private String capital;
    private float temperature;
    private String country;
    private String language;
    private String linkToTempGraph;

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
