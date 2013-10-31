
package com.webyweather.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Weather {

    @JsonProperty("current")
    private Current current;

    @JsonProperty("forecast")
    private Forecast forecast;

    public Current getCurrent () {
        return this.current;
    }

    public void setCurrent (Current current) {
        this.current = current;
    }

    public Forecast getForecast () {
        return this.forecast;
    }

    public void setForecast (Forecast forecast) {
        this.forecast = forecast;
    }
}
