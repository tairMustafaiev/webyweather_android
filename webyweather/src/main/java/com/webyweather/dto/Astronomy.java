
package com.webyweather.dto;

public class Astronomy {

    private String moonrise;

    private String moonset;

    private String sunrise;

    private String sunset;

    public String getMoonrise () {
        return this.moonrise;
    }

    public void setMoonrise (String moonrise) {
        this.moonrise = moonrise;
    }

    public String getMoonset () {
        return this.moonset;
    }

    public void setMoonset (String moonset) {
        this.moonset = moonset;
    }

    public String getSunrise () {
        return this.sunrise;
    }

    public void setSunrise (String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset () {
        return this.sunset;
    }

    public void setSunset (String sunset) {
        this.sunset = sunset;
    }
}
