
package com.webyweather.dto;

public class Propositions {

    private Proposition proposition;

    private Temperature temperature;

    private WeatherCondition weathercondition;

    public Proposition getProposition () {
        return this.proposition;
    }

    public void setProposition (Proposition proposition) {
        this.proposition = proposition;
    }

    public Temperature getTemperature () {
        return this.temperature;
    }

    public void setTemperature (Temperature temperature) {
        this.temperature = temperature;
    }

    public WeatherCondition getWeathercondition () {
        return this.weathercondition;
    }

    public void setWeathercondition (WeatherCondition weathercondition) {
        this.weathercondition = weathercondition;
    }
}
